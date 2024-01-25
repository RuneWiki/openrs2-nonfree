import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class28 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
	private int anInt1197 = 65000;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!pl;")
	private Class162 aClass162_2 = null;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "Lclient!pl;")
	private Class162 aClass162_3 = null;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	private final int anInt1200;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILclient!pl;Lclient!pl;I)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3) {
		this.aClass162_3 = arg2;
		this.anInt1200 = arg0;
		this.aClass162_2 = arg1;
		this.anInt1197 = arg3;
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1200;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[BB)Z")
	public boolean method1128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) Class162 local11 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			if (arg1 < 0 || this.anInt1197 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method1129(arg0, arg2, arg1, true);
			if (!local35) {
				local35 = this.method1129(arg0, arg2, arg1, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[BIZB)Z")
	private boolean method1129(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class162 local8 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if (this.aClass162_3.method4548() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass162_3.method4553((long) (arg0 * 6));
					this.aClass162_3.method4545(Static13.aByteArray8, 6, 0);
					local71 = (Static13.aByteArray8[5] & 0xFF) + ((Static13.aByteArray8[3] & 0xFF) << 16) + ((Static13.aByteArray8[4] & 0xFF) << 8);
					if (local71 <= 0 || this.aClass162_2.method4548() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass162_2.method4548() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static13.aByteArray8[3] = (byte) (local71 >> 16);
				Static13.aByteArray8[2] = (byte) arg2;
				Static13.aByteArray8[4] = (byte) (local71 >> 8);
				Static13.aByteArray8[0] = (byte) (arg2 >> 16);
				Static13.aByteArray8[5] = (byte) local71;
				Static13.aByteArray8[1] = (byte) (arg2 >> 8);
				this.aClass162_3.method4553((long) (arg0 * 6));
				this.aClass162_3.method4549(Static13.aByteArray8, 6, 0);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (arg2 > local170) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg3) {
						this.aClass162_2.method4553((long) (local71 * 520));
						try {
							this.aClass162_2.method4545(Static13.aByteArray8, 8, 0);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = ((Static13.aByteArray8[0] & 0xFF) << 8) + (Static13.aByteArray8[1] & 0xFF);
						local176 = (Static13.aByteArray8[6] & 0xFF) + ((Static13.aByteArray8[5] & 0xFF) << 8) + ((Static13.aByteArray8[4] & 0xFF) << 16);
						@Pc(247) int local247 = ((Static13.aByteArray8[2] & 0xFF) << 8) + (Static13.aByteArray8[3] & 0xFF);
						@Pc(253) int local253 = Static13.aByteArray8[7] & 0xFF;
						if (arg0 != local211 || local247 != local172 || this.anInt1200 != local253) {
							return false;
						}
						if (local176 < 0 || this.aClass162_2.method4548() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass162_2.method4548() + 519L) / 520L);
						arg3 = false;
						if (local176 == 0) {
							local176++;
						}
						if (local71 == local176) {
							local176++;
						}
					}
					Static13.aByteArray8[0] = (byte) (arg0 >> 8);
					Static13.aByteArray8[2] = (byte) (local172 >> 8);
					Static13.aByteArray8[1] = (byte) arg0;
					Static13.aByteArray8[3] = (byte) local172;
					if (arg2 - local170 <= 512) {
						local176 = 0;
					}
					Static13.aByteArray8[7] = (byte) this.anInt1200;
					Static13.aByteArray8[5] = (byte) (local176 >> 8);
					Static13.aByteArray8[6] = (byte) local176;
					Static13.aByteArray8[4] = (byte) (local176 >> 16);
					this.aClass162_2.method4553((long) (local71 * 520));
					this.aClass162_2.method4549(Static13.aByteArray8, 8, 0);
					local211 = arg2 - local170;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass162_2.method4549(arg1, local211, local170);
					local71 = local176;
					local172++;
					local170 += local211;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)[B")
	public byte[] method1131(@OriginalArg(1) int arg0) {
		@Pc(8) Class162 local8 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass162_3.method4548()) {
					return null;
				}
				this.aClass162_3.method4553((long) (arg0 * 6));
				this.aClass162_3.method4545(Static13.aByteArray8, 6, 0);
				@Pc(67) int local67 = ((Static13.aByteArray8[0] & 0xFF) << 16) + ((Static13.aByteArray8[1] & 0xFF) << 8) + (Static13.aByteArray8[2] & 0xFF);
				@Pc(99) int local99 = (Static13.aByteArray8[5] & 0xFF) + (((Static13.aByteArray8[3] & 0xFF) << 16) + ((Static13.aByteArray8[4] & 0xFF) << 8));
				if (local67 < 0 || local67 > this.anInt1197) {
					return null;
				} else if (local99 > 0 && this.aClass162_2.method4548() / 520L >= (long) local99) {
					@Pc(142) byte[] local142 = new byte[local67];
					@Pc(144) int local144 = 0;
					@Pc(146) int local146 = 0;
					label55: while (local144 < local67) {
						if (local99 == 0) {
							return null;
						}
						this.aClass162_2.method4553((long) (local99 * 520));
						@Pc(169) int local169 = local67 - local144;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass162_2.method4545(Static13.aByteArray8, local169 + 8, 0);
						@Pc(199) int local199 = ((Static13.aByteArray8[0] & 0xFF) << 8) + (Static13.aByteArray8[1] & 0xFF);
						@Pc(213) int local213 = ((Static13.aByteArray8[2] & 0xFF) << 8) + (Static13.aByteArray8[3] & 0xFF);
						@Pc(236) int local236 = (Static13.aByteArray8[6] & 0xFF) + (((Static13.aByteArray8[4] & 0xFF) << 16) + ((Static13.aByteArray8[5] & 0xFF) << 8));
						@Pc(242) int local242 = Static13.aByteArray8[7] & 0xFF;
						if (local199 == arg0 && local146 == local213 && local242 == this.anInt1200) {
							if (local236 >= 0 && (long) local236 <= this.aClass162_2.method4548() / 520L) {
								local146++;
								local99 = local236;
								@Pc(285) int local285 = 0;
								while (true) {
									if (local285 >= local169) {
										continue label55;
									}
									local142[local144++] = Static13.aByteArray8[local285 + 8];
									local285++;
								}
							}
							return null;
						}
						return null;
					}
					return local142;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}
}
