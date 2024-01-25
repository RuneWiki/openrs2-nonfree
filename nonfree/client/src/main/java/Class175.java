import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class175 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!fk;")
	private Class85 aClass85_5 = null;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	private int anInt5025 = 65000;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!fk;")
	private Class85 aClass85_4 = null;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	private final int anInt5026;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILclient!fk;Lclient!fk;I)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) int arg3) {
		this.aClass85_5 = arg2;
		this.anInt5025 = arg3;
		this.aClass85_4 = arg1;
		this.anInt5026 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIZ)Z")
	public boolean method4072(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class85 local11 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			if (arg1 < 0 || arg1 > this.anInt5025) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method4076(arg1, arg0, arg2, true);
			if (!local38) {
				local38 = this.method4076(arg1, arg0, arg2, false);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[B")
	public byte[] method4075(@OriginalArg(1) int arg0) {
		@Pc(14) Class85 local14 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass85_5.method1724()) {
					return null;
				}
				this.aClass85_5.method1722((long) (arg0 * 6));
				this.aClass85_5.method1717(0, Static154.aByteArray82, 6);
				@Pc(73) int local73 = (Static154.aByteArray82[2] & 0xFF) + ((Static154.aByteArray82[1] & 0xFF) << 8) + ((Static154.aByteArray82[0] & 0xFF) << 16);
				@Pc(96) int local96 = ((Static154.aByteArray82[4] & 0xFF) << 8) + (((Static154.aByteArray82[3] & 0xFF) << 16) + (Static154.aByteArray82[5] & 0xFF));
				if (local73 < 0 || this.anInt5025 < local73) {
					return null;
				} else if (local96 > 0 && (long) local96 <= this.aClass85_4.method1724() / 520L) {
					@Pc(140) byte[] local140 = new byte[local73];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					label55: while (local142 < local73) {
						if (local96 == 0) {
							return null;
						}
						this.aClass85_4.method1722((long) (local96 * 520));
						@Pc(169) int local169 = local73 - local142;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass85_4.method1717(0, Static154.aByteArray82, local169 + 8);
						@Pc(199) int local199 = (Static154.aByteArray82[1] & 0xFF) + ((Static154.aByteArray82[0] & 0xFF) << 8);
						@Pc(213) int local213 = (Static154.aByteArray82[3] & 0xFF) + ((Static154.aByteArray82[2] & 0xFF) << 8);
						@Pc(236) int local236 = (Static154.aByteArray82[6] & 0xFF) + (((Static154.aByteArray82[4] & 0xFF) << 16) + ((Static154.aByteArray82[5] & 0xFF) << 8));
						@Pc(242) int local242 = Static154.aByteArray82[7] & 0xFF;
						if (local199 == arg0 && local144 == local213 && this.anInt5026 == local242) {
							if (local236 >= 0 && (long) local236 <= this.aClass85_4.method1724() / 520L) {
								local144++;
								local96 = local236;
								@Pc(299) int local299 = 0;
								while (true) {
									if (local299 >= local169) {
										continue label55;
									}
									local140[local142++] = Static154.aByteArray82[local299 + 8];
									local299++;
								}
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(328) IOException local328) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method4076(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class85 local8 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass85_5.method1724()) {
						return false;
					}
					this.aClass85_5.method1722((long) (arg2 * 6));
					this.aClass85_5.method1717(0, Static154.aByteArray82, 6);
					local22 = ((Static154.aByteArray82[4] & 0xFF) << 8) + (Static154.aByteArray82[3] << 16 & 0xFF0000) + (Static154.aByteArray82[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass85_4.method1724() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass85_4.method1724() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static154.aByteArray82[3] = (byte) (local22 >> 16);
				Static154.aByteArray82[1] = (byte) (arg0 >> 8);
				Static154.aByteArray82[2] = (byte) arg0;
				Static154.aByteArray82[0] = (byte) (arg0 >> 16);
				Static154.aByteArray82[4] = (byte) (local22 >> 8);
				Static154.aByteArray82[5] = (byte) local22;
				this.aClass85_5.method1722((long) (arg2 * 6));
				this.aClass85_5.method1721(6, 0, Static154.aByteArray82);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (local174 < arg0) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg3) {
						this.aClass85_4.method1722((long) (local22 * 520));
						try {
							this.aClass85_4.method1717(0, Static154.aByteArray82, 8);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = (Static154.aByteArray82[1] & 0xFF) + ((Static154.aByteArray82[0] & 0xFF) << 8);
						local180 = ((Static154.aByteArray82[4] & 0xFF) << 16) + ((Static154.aByteArray82[5] & 0xFF) << 8) + (Static154.aByteArray82[6] & 0xFF);
						@Pc(252) int local252 = ((Static154.aByteArray82[2] & 0xFF) << 8) + (Static154.aByteArray82[3] & 0xFF);
						@Pc(258) int local258 = Static154.aByteArray82[7] & 0xFF;
						if (local215 != arg2 || local176 != local252 || local258 != this.anInt5026) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass85_4.method1724() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						local180 = (int) ((this.aClass85_4.method1724() + 519L) / 520L);
						arg3 = false;
						if (local180 == 0) {
							local180++;
						}
						if (local22 == local180) {
							local180++;
						}
					}
					Static154.aByteArray82[2] = (byte) (local176 >> 8);
					Static154.aByteArray82[1] = (byte) arg2;
					Static154.aByteArray82[0] = (byte) (arg2 >> 8);
					Static154.aByteArray82[3] = (byte) local176;
					if (arg0 - local174 <= 512) {
						local180 = 0;
					}
					Static154.aByteArray82[6] = (byte) local180;
					Static154.aByteArray82[4] = (byte) (local180 >> 16);
					Static154.aByteArray82[5] = (byte) (local180 >> 8);
					Static154.aByteArray82[7] = (byte) this.anInt5026;
					this.aClass85_4.method1722((long) (local22 * 520));
					this.aClass85_4.method1721(8, 0, Static154.aByteArray82);
					local215 = arg0 - local174;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass85_4.method1721(local215, local174, arg1);
					local176++;
					local174 += local215;
					local22 = local180;
				}
				return true;
			} catch (@Pc(449) IOException local449) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5026;
	}
}
