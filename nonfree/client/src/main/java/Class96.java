import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class96 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	private int anInt4436 = 65000;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!kj;")
	private Class56 aClass56_5 = null;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!kj;")
	private Class56 aClass56_4 = null;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILclient!kj;Lclient!kj;I)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3) {
		this.anInt4435 = arg0;
		this.anInt4436 = arg3;
		this.aClass56_5 = arg1;
		this.aClass56_4 = arg2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZ[B)Z")
	private boolean method3071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class56 local8 = this.aClass56_5;
		synchronized (this.aClass56_5) {
			try {
				@Pc(71) int local71;
				if (arg2) {
					if (this.aClass56_4.method1784() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass56_4.method1794((long) (arg1 * 6));
					this.aClass56_4.method1792(Static204.aByteArray63, 0, 6);
					local71 = ((Static204.aByteArray63[4] & 0xFF) << 8) + ((Static204.aByteArray63[3] & 0xFF) << 16) + (Static204.aByteArray63[5] & 0xFF);
					if (local71 <= 0 || (long) local71 > this.aClass56_5.method1784() / 520L) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass56_5.method1784() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static204.aByteArray63[0] = (byte) (arg0 >> 16);
				Static204.aByteArray63[5] = (byte) local71;
				@Pc(123) int local123 = 0;
				Static204.aByteArray63[2] = (byte) arg0;
				Static204.aByteArray63[4] = (byte) (local71 >> 8);
				Static204.aByteArray63[3] = (byte) (local71 >> 16);
				@Pc(144) int local144 = 0;
				Static204.aByteArray63[1] = (byte) (arg0 >> 8);
				this.aClass56_4.method1794((long) (arg1 * 6));
				this.aClass56_4.method1782(Static204.aByteArray63, 6, 0);
				while (local123 < arg0) {
					@Pc(170) int local170 = 0;
					@Pc(228) int local228;
					if (arg2) {
						this.aClass56_5.method1794((long) (local71 * 520));
						try {
							this.aClass56_5.method1792(Static204.aByteArray63, 0, 8);
						} catch (@Pc(189) EOFException local189) {
							return true;
						}
						local170 = (Static204.aByteArray63[6] & 0xFF) + ((Static204.aByteArray63[5] & 0xFF) << 8) + ((Static204.aByteArray63[4] & 0xFF) << 16);
						local228 = ((Static204.aByteArray63[0] & 0xFF) << 8) + (Static204.aByteArray63[1] & 0xFF);
						@Pc(242) int local242 = ((Static204.aByteArray63[2] & 0xFF) << 8) + (Static204.aByteArray63[3] & 0xFF);
						@Pc(248) int local248 = Static204.aByteArray63[7] & 0xFF;
						if (local228 != arg1 || local144 != local242 || local248 != this.anInt4435) {
							return false;
						}
						if (local170 < 0 || this.aClass56_5.method1784() / 520L < (long) local170) {
							return false;
						}
					}
					if (local170 == 0) {
						local170 = (int) ((this.aClass56_5.method1784() + 519L) / 520L);
						arg2 = false;
						if (local170 == 0) {
							local170++;
						}
						if (local170 == local71) {
							local170++;
						}
					}
					Static204.aByteArray63[2] = (byte) (local144 >> 8);
					Static204.aByteArray63[1] = (byte) arg1;
					Static204.aByteArray63[3] = (byte) local144;
					Static204.aByteArray63[0] = (byte) (arg1 >> 8);
					Static204.aByteArray63[7] = (byte) this.anInt4435;
					local144++;
					if (arg0 - local123 <= 512) {
						local170 = 0;
					}
					Static204.aByteArray63[5] = (byte) (local170 >> 8);
					local228 = arg0 - local123;
					if (local228 > 512) {
						local228 = 512;
					}
					Static204.aByteArray63[4] = (byte) (local170 >> 16);
					Static204.aByteArray63[6] = (byte) local170;
					this.aClass56_5.method1794((long) (local71 * 520));
					local71 = local170;
					this.aClass56_5.method1782(Static204.aByteArray63, 8, 0);
					this.aClass56_5.method1782(arg3, local228, local123);
					local123 += local228;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[B")
	public byte[] method3073(@OriginalArg(0) int arg0) {
		@Pc(8) Class56 local8 = this.aClass56_5;
		synchronized (this.aClass56_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass56_4.method1784()) {
					return null;
				}
				this.aClass56_4.method1794((long) (arg0 * 6));
				this.aClass56_4.method1792(Static204.aByteArray63, 0, 6);
				@Pc(69) int local69 = (Static204.aByteArray63[2] & 0xFF) + ((Static204.aByteArray63[1] & 0xFF) << 8) + ((Static204.aByteArray63[0] & 0xFF) << 16);
				@Pc(91) int local91 = (Static204.aByteArray63[5] & 0xFF) + ((Static204.aByteArray63[4] & 0xFF) << 8) + ((Static204.aByteArray63[3] & 0xFF) << 16);
				if (local69 < 0 || this.anInt4436 < local69) {
					return null;
				} else if (local91 > 0 && this.aClass56_5.method1784() / 520L >= (long) local91) {
					@Pc(127) byte[] local127 = new byte[local69];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local69 > local138) {
						if (local91 == 0) {
							return null;
						}
						this.aClass56_5.method1794((long) (local91 * 520));
						@Pc(163) int local163 = local69 - local138;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass56_5.method1792(Static204.aByteArray63, 0, local163 + 8);
						@Pc(191) int local191 = (Static204.aByteArray63[1] & 0xFF) + ((Static204.aByteArray63[0] & 0xFF) << 8);
						@Pc(213) int local213 = ((Static204.aByteArray63[5] & 0xFF) << 8) + (Static204.aByteArray63[4] << 16 & 0xFF0000) + (Static204.aByteArray63[6] & 0xFF);
						@Pc(219) int local219 = Static204.aByteArray63[7] & 0xFF;
						@Pc(233) int local233 = (Static204.aByteArray63[3] & 0xFF) + ((Static204.aByteArray63[2] & 0xFF) << 8);
						if (local191 == arg0 && local140 == local233 && this.anInt4435 == local219) {
							if (local213 >= 0 && (long) local213 <= this.aClass56_5.method1784() / 520L) {
								for (@Pc(276) int local276 = 0; local276 < local163; local276++) {
									local127[local138++] = Static204.aByteArray63[local276 + 8];
								}
								local91 = local213;
								local140++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIII)Z")
	public boolean method3074(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class56 local14 = this.aClass56_5;
		synchronized (this.aClass56_5) {
			if (arg2 < 0 || arg2 > this.anInt4436) {
				throw new IllegalArgumentException();
			}
			@Pc(41) boolean local41 = this.method3071(arg2, arg1, true, arg0);
			if (!local41) {
				local41 = this.method3071(arg2, arg1, false, arg0);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4435;
	}
}
