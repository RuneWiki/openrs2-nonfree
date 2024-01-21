import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class10 {

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private int anInt262 = 65000;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!ob;")
	private Class47 aClass47_2 = null;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!ob;")
	private Class47 aClass47_1 = null;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	private final int anInt265;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILclient!ob;Lclient!ob;I)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3) {
		this.aClass47_1 = arg2;
		this.aClass47_2 = arg1;
		this.anInt265 = arg0;
		this.anInt262 = arg3;
	}

	@OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt265;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[B")
	public byte[] method224(@OriginalArg(1) int arg0) {
		@Pc(8) Class47 local8 = this.aClass47_2;
		synchronized (this.aClass47_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass47_1.method1292()) {
					return null;
				}
				this.aClass47_1.method1295((long) (arg0 * 6));
				this.aClass47_1.method1289(0, Static15.aByteArray3, 6);
				@Pc(69) int local69 = (Static15.aByteArray3[5] & 0xFF) + ((Static15.aByteArray3[4] & 0xFF) << 8) + ((Static15.aByteArray3[3] & 0xFF) << 16);
				@Pc(101) int local101 = ((Static15.aByteArray3[1] & 0xFF) << 8) + ((Static15.aByteArray3[0] & 0xFF) << 16) + (Static15.aByteArray3[2] & 0xFF);
				if (local101 < 0 || local101 > this.anInt262) {
					return null;
				} else if (local69 > 0 && (long) local69 <= this.aClass47_2.method1292() / 520L) {
					@Pc(136) int local136 = 0;
					@Pc(139) byte[] local139 = new byte[local101];
					@Pc(141) int local141 = 0;
					while (local136 < local101) {
						if (local69 == 0) {
							return null;
						}
						this.aClass47_2.method1295((long) (local69 * 520));
						@Pc(167) int local167 = local101 - local136;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass47_2.method1289(0, Static15.aByteArray3, local167 + 8);
						@Pc(196) int local196 = ((Static15.aByteArray3[2] & 0xFF) << 8) + (Static15.aByteArray3[3] & 0xFF);
						@Pc(219) int local219 = ((Static15.aByteArray3[4] & 0xFF) << 16) + ((Static15.aByteArray3[5] & 0xFF) << 8) + (Static15.aByteArray3[6] & 0xFF);
						@Pc(233) int local233 = (Static15.aByteArray3[1] & 0xFF) + ((Static15.aByteArray3[0] & 0xFF) << 8);
						@Pc(239) int local239 = Static15.aByteArray3[7] & 0xFF;
						if (local233 == arg0 && local196 == local141 && this.anInt265 == local239) {
							if (local219 >= 0 && (long) local219 <= this.aClass47_2.method1292() / 520L) {
								local69 = local219;
								for (@Pc(284) int local284 = 0; local284 < local167; local284++) {
									local139[local136++] = Static15.aByteArray3[local284 + 8];
								}
								local141++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local139;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BIIZI)Z")
	private boolean method226(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class47 local8 = this.aClass47_2;
		synchronized (this.aClass47_2) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass47_1.method1292() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass47_1.method1295((long) (arg3 * 6));
					this.aClass47_1.method1289(0, Static15.aByteArray3, 6);
					local22 = (Static15.aByteArray3[5] & 0xFF) + (((Static15.aByteArray3[3] & 0xFF) << 16) + ((Static15.aByteArray3[4] & 0xFF) << 8));
					if (local22 <= 0 || (long) local22 > this.aClass47_2.method1292() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass47_2.method1292() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static15.aByteArray3[0] = (byte) (arg1 >> 16);
				Static15.aByteArray3[5] = (byte) local22;
				Static15.aByteArray3[3] = (byte) (local22 >> 16);
				Static15.aByteArray3[1] = (byte) (arg1 >> 8);
				Static15.aByteArray3[4] = (byte) (local22 >> 8);
				@Pc(149) int local149 = 0;
				Static15.aByteArray3[2] = (byte) arg1;
				this.aClass47_1.method1295((long) (arg3 * 6));
				this.aClass47_1.method1298(6, 0, Static15.aByteArray3);
				@Pc(171) int local171 = 0;
				while (arg1 > local149) {
					@Pc(175) int local175 = 0;
					@Pc(211) int local211;
					if (arg2) {
						this.aClass47_2.method1295((long) (local22 * 520));
						try {
							this.aClass47_2.method1289(0, Static15.aByteArray3, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local211 = ((Static15.aByteArray3[0] & 0xFF) << 8) + (Static15.aByteArray3[1] & 0xFF);
						local175 = (Static15.aByteArray3[6] & 0xFF) + ((Static15.aByteArray3[4] & 0xFF) << 16) + ((Static15.aByteArray3[5] & 0xFF) << 8);
						@Pc(240) int local240 = Static15.aByteArray3[7] & 0xFF;
						@Pc(254) int local254 = ((Static15.aByteArray3[2] & 0xFF) << 8) + (Static15.aByteArray3[3] & 0xFF);
						if (local211 != arg3 || local254 != local171 || this.anInt265 != local240) {
							return false;
						}
						if (local175 < 0 || this.aClass47_2.method1292() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg2 = false;
						local175 = (int) ((this.aClass47_2.method1292() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local22) {
							local175++;
						}
					}
					Static15.aByteArray3[0] = (byte) (arg3 >> 8);
					local211 = arg1 - local149;
					if (local211 > 512) {
						local211 = 512;
					}
					Static15.aByteArray3[7] = (byte) this.anInt265;
					Static15.aByteArray3[1] = (byte) arg3;
					Static15.aByteArray3[2] = (byte) (local171 >> 8);
					if (arg1 - local149 <= 512) {
						local175 = 0;
					}
					Static15.aByteArray3[6] = (byte) local175;
					Static15.aByteArray3[4] = (byte) (local175 >> 16);
					Static15.aByteArray3[5] = (byte) (local175 >> 8);
					Static15.aByteArray3[3] = (byte) local171;
					local171++;
					this.aClass47_2.method1295((long) (local22 * 520));
					this.aClass47_2.method1298(8, 0, Static15.aByteArray3);
					this.aClass47_2.method1298(local211, local149, arg0);
					local22 = local175;
					local149 += local211;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BI)Z")
	public boolean method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class47 local6 = this.aClass47_2;
		synchronized (this.aClass47_2) {
			if (arg1 < 0 || this.anInt262 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method226(arg2, arg1, true, arg0);
			if (!local39) {
				local39 = this.method226(arg2, arg1, false, arg0);
			}
			return local39;
		}
	}
}
