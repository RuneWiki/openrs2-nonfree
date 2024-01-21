import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class80 {

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!rc;")
	private Class65 aClass65_4 = null;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	private int anInt3004 = 65000;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!rc;")
	private Class65 aClass65_5 = null;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	private final int anInt3006;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILclient!rc;Lclient!rc;I)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3) {
		this.aClass65_5 = arg2;
		this.anInt3004 = arg3;
		this.anInt3006 = arg0;
		this.aClass65_4 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[B")
	public byte[] method1959(@OriginalArg(1) int arg0) {
		@Pc(8) Class65 local8 = this.aClass65_4;
		synchronized (this.aClass65_4) {
			try {
				if (this.aClass65_5.method1712() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass65_5.method1716((long) (arg0 * 6));
				this.aClass65_5.method1718(Static54.aByteArray15, 6, 0);
				@Pc(71) int local71 = ((Static54.aByteArray15[0] & 0xFF) << 16) + ((Static54.aByteArray15[1] & 0xFF) << 8) + (Static54.aByteArray15[2] & 0xFF);
				@Pc(94) int local94 = (Static54.aByteArray15[5] & 0xFF) + (((Static54.aByteArray15[3] & 0xFF) << 16) + ((Static54.aByteArray15[4] & 0xFF) << 8));
				if (local71 < 0 || local71 > this.anInt3004) {
					return null;
				} else if (local94 > 0 && this.aClass65_4.method1712() / 520L >= (long) local94) {
					@Pc(141) int local141 = 0;
					@Pc(144) byte[] local144 = new byte[local71];
					@Pc(146) int local146 = 0;
					label55: while (local146 < local71) {
						if (local94 == 0) {
							return null;
						}
						@Pc(161) int local161 = local71 - local146;
						this.aClass65_4.method1716((long) (local94 * 520));
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass65_4.method1718(Static54.aByteArray15, local161 + 8, 0);
						@Pc(199) int local199 = (Static54.aByteArray15[3] & 0xFF) + ((Static54.aByteArray15[2] & 0xFF) << 8);
						@Pc(205) int local205 = Static54.aByteArray15[7] & 0xFF;
						@Pc(219) int local219 = (Static54.aByteArray15[1] & 0xFF) + ((Static54.aByteArray15[0] & 0xFF) << 8);
						@Pc(241) int local241 = (Static54.aByteArray15[6] & 0xFF) + ((Static54.aByteArray15[4] & 0xFF) << 16) + ((Static54.aByteArray15[5] & 0xFF) << 8);
						if (arg0 == local219 && local141 == local199 && this.anInt3006 == local205) {
							if (local241 >= 0 && (long) local241 <= this.aClass65_4.method1712() / 520L) {
								local94 = local241;
								local141++;
								@Pc(295) int local295 = 0;
								while (true) {
									if (local161 <= local295) {
										continue label55;
									}
									local144[local146++] = Static54.aByteArray15[local295 + 8];
									local295++;
								}
							}
							return null;
						}
						return null;
					}
					return local144;
				} else {
					return null;
				}
			} catch (@Pc(324) IOException local324) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIZII)Z")
	private boolean method1960(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class65 local8 = this.aClass65_4;
		synchronized (this.aClass65_4) {
			try {
				@Pc(73) int local73;
				if (arg1) {
					if (this.aClass65_5.method1712() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass65_5.method1716((long) (arg2 * 6));
					this.aClass65_5.method1718(Static54.aByteArray15, 6, 0);
					local73 = ((Static54.aByteArray15[3] & 0xFF) << 16) + ((Static54.aByteArray15[4] & 0xFF) << 8) + (Static54.aByteArray15[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aClass65_4.method1712() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass65_4.method1712() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static54.aByteArray15[1] = (byte) (arg3 >> 8);
				Static54.aByteArray15[0] = (byte) (arg3 >> 16);
				Static54.aByteArray15[5] = (byte) local73;
				Static54.aByteArray15[2] = (byte) arg3;
				Static54.aByteArray15[3] = (byte) (local73 >> 16);
				@Pc(138) int local138 = 0;
				@Pc(140) int local140 = 0;
				Static54.aByteArray15[4] = (byte) (local73 >> 8);
				this.aClass65_5.method1716((long) (arg2 * 6));
				this.aClass65_5.method1711(6, Static54.aByteArray15, 0);
				while (local138 < arg3) {
					@Pc(166) int local166 = 0;
					@Pc(224) int local224;
					if (arg1) {
						this.aClass65_4.method1716((long) (local73 * 520));
						try {
							this.aClass65_4.method1718(Static54.aByteArray15, 8, 0);
						} catch (@Pc(185) EOFException local185) {
							return true;
						}
						local166 = ((Static54.aByteArray15[4] & 0xFF) << 16) + (((Static54.aByteArray15[5] & 0xFF) << 8) + (Static54.aByteArray15[6] & 0xFF));
						local224 = (Static54.aByteArray15[1] & 0xFF) + ((Static54.aByteArray15[0] & 0xFF) << 8);
						@Pc(238) int local238 = ((Static54.aByteArray15[2] & 0xFF) << 8) + (Static54.aByteArray15[3] & 0xFF);
						@Pc(244) int local244 = Static54.aByteArray15[7] & 0xFF;
						if (local224 != arg2 || local238 != local140 || local244 != this.anInt3006) {
							return false;
						}
						if (local166 < 0 || this.aClass65_4.method1712() / 520L < (long) local166) {
							return false;
						}
					}
					if (local166 == 0) {
						arg1 = false;
						local166 = (int) ((this.aClass65_4.method1712() + 519L) / 520L);
						if (local166 == 0) {
							local166++;
						}
						if (local73 == local166) {
							local166++;
						}
					}
					Static54.aByteArray15[7] = (byte) this.anInt3006;
					Static54.aByteArray15[2] = (byte) (local140 >> 8);
					Static54.aByteArray15[0] = (byte) (arg2 >> 8);
					Static54.aByteArray15[3] = (byte) local140;
					if (arg3 - local138 <= 512) {
						local166 = 0;
					}
					Static54.aByteArray15[6] = (byte) local166;
					Static54.aByteArray15[4] = (byte) (local166 >> 16);
					Static54.aByteArray15[1] = (byte) arg2;
					Static54.aByteArray15[5] = (byte) (local166 >> 8);
					local140++;
					this.aClass65_4.method1716((long) (local73 * 520));
					local73 = local166;
					this.aClass65_4.method1711(8, Static54.aByteArray15, 0);
					local224 = arg3 - local138;
					if (local224 > 512) {
						local224 = 512;
					}
					this.aClass65_4.method1711(local224, arg0, local138);
					local138 += local224;
				}
				return true;
			} catch (@Pc(424) IOException local424) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3006;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BI)Z")
	public boolean method1961(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class65 local6 = this.aClass65_4;
		synchronized (this.aClass65_4) {
			if (arg0 < 0 || arg0 > this.anInt3004) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method1960(arg1, true, arg2, arg0);
			if (!local30) {
				local30 = this.method1960(arg1, false, arg2, arg0);
			}
			return local30;
		}
	}
}
