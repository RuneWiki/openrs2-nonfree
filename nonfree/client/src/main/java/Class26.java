import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class26 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!ofa;")
	private Class240 aClass240_1 = null;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ofa;")
	private Class240 aClass240_2 = null;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	private int anInt1422 = 65000;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	private final int anInt1414;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILclient!ofa;Lclient!ofa;I)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(2) Class240 arg2, @OriginalArg(3) int arg3) {
		this.aClass240_1 = arg2;
		this.anInt1422 = arg3;
		this.anInt1414 = arg0;
		this.aClass240_2 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)[B")
	public byte[] method1338(@OriginalArg(0) int arg0) {
		@Pc(13) Class240 local13 = this.aClass240_2;
		synchronized (this.aClass240_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass240_1.method6273()) {
					return null;
				}
				this.aClass240_1.method6272((long) (arg0 * 6));
				this.aClass240_1.method6275(0, Static299.aByteArray42, 6);
				@Pc(74) int local74 = (Static299.aByteArray42[2] & 0xFF) + ((Static299.aByteArray42[1] & 0xFF) << 8) + ((Static299.aByteArray42[0] & 0xFF) << 16);
				@Pc(97) int local97 = (Static299.aByteArray42[5] & 0xFF) + (((Static299.aByteArray42[3] & 0xFF) << 16) + ((Static299.aByteArray42[4] & 0xFF) << 8));
				if (local74 < 0 || local74 > this.anInt1422) {
					return null;
				} else if (local97 > 0 && this.aClass240_2.method6273() / 520L >= (long) local97) {
					@Pc(141) byte[] local141 = new byte[local74];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local74 > local143) {
						if (local97 == 0) {
							return null;
						}
						this.aClass240_2.method6272((long) (local97 * 520));
						@Pc(168) int local168 = local74 - local143;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass240_2.method6275(0, Static299.aByteArray42, local168 + 8);
						@Pc(199) int local199 = ((Static299.aByteArray42[0] & 0xFF) << 8) + (Static299.aByteArray42[1] & 0xFF);
						@Pc(213) int local213 = ((Static299.aByteArray42[2] & 0xFF) << 8) + (Static299.aByteArray42[3] & 0xFF);
						@Pc(235) int local235 = ((Static299.aByteArray42[5] & 0xFF) << 8) + ((Static299.aByteArray42[4] & 0xFF) << 16) + (Static299.aByteArray42[6] & 0xFF);
						@Pc(241) int local241 = Static299.aByteArray42[7] & 0xFF;
						if (arg0 == local199 && local145 == local213 && this.anInt1414 == local241) {
							if (local235 >= 0 && this.aClass240_2.method6273() / 520L >= (long) local235) {
								local145++;
								for (@Pc(286) int local286 = 0; local286 < local168; local286++) {
									local141[local143++] = Static299.aByteArray42[local286 + 8];
								}
								local97 = local235;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZIB[BI)Z")
	private boolean method1340(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class240 local8 = this.aClass240_2;
		synchronized (this.aClass240_2) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass240_1.method6273()) {
						return false;
					}
					this.aClass240_1.method6272((long) (arg3 * 6));
					this.aClass240_1.method6275(0, Static299.aByteArray42, 6);
					local22 = (Static299.aByteArray42[5] & 0xFF) + ((Static299.aByteArray42[4] & 0xFF) << 8) + ((Static299.aByteArray42[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass240_2.method6273() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass240_2.method6273() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static299.aByteArray42[2] = (byte) arg1;
				Static299.aByteArray42[0] = (byte) (arg1 >> 16);
				Static299.aByteArray42[3] = (byte) (local22 >> 16);
				Static299.aByteArray42[1] = (byte) (arg1 >> 8);
				Static299.aByteArray42[5] = (byte) local22;
				Static299.aByteArray42[4] = (byte) (local22 >> 8);
				this.aClass240_1.method6272((long) (arg3 * 6));
				this.aClass240_1.method6278(6, 0, Static299.aByteArray42);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (arg1 > local176) {
					@Pc(182) int local182 = 0;
					@Pc(217) int local217;
					if (arg0) {
						this.aClass240_2.method6272((long) (local22 * 520));
						try {
							this.aClass240_2.method6275(0, Static299.aByteArray42, 8);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local217 = (Static299.aByteArray42[1] & 0xFF) + ((Static299.aByteArray42[0] & 0xFF) << 8);
						local182 = (Static299.aByteArray42[6] & 0xFF) + ((Static299.aByteArray42[5] & 0xFF) << 8) + ((Static299.aByteArray42[4] & 0xFF) << 16);
						@Pc(253) int local253 = (Static299.aByteArray42[3] & 0xFF) + ((Static299.aByteArray42[2] & 0xFF) << 8);
						@Pc(259) int local259 = Static299.aByteArray42[7] & 0xFF;
						if (local217 != arg3 || local178 != local253 || this.anInt1414 != local259) {
							return false;
						}
						if (local182 < 0 || (long) local182 > this.aClass240_2.method6273() / 520L) {
							return false;
						}
					}
					if (local182 == 0) {
						arg0 = false;
						local182 = (int) ((this.aClass240_2.method6273() + 519L) / 520L);
						if (local182 == 0) {
							local182++;
						}
						if (local22 == local182) {
							local182++;
						}
					}
					Static299.aByteArray42[0] = (byte) (arg3 >> 8);
					if (arg1 - local176 <= 512) {
						local182 = 0;
					}
					Static299.aByteArray42[2] = (byte) (local178 >> 8);
					Static299.aByteArray42[3] = (byte) local178;
					Static299.aByteArray42[1] = (byte) arg3;
					Static299.aByteArray42[7] = (byte) this.anInt1414;
					Static299.aByteArray42[5] = (byte) (local182 >> 8);
					Static299.aByteArray42[4] = (byte) (local182 >> 16);
					Static299.aByteArray42[6] = (byte) local182;
					this.aClass240_2.method6272((long) (local22 * 520));
					this.aClass240_2.method6278(8, 0, Static299.aByteArray42);
					local217 = arg1 - local176;
					if (local217 > 512) {
						local217 = 512;
					}
					this.aClass240_2.method6278(local217, local176, arg2);
					local22 = local182;
					local178++;
					local176 += local217;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1414;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZII[B)Z")
	public boolean method1343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class240 local6 = this.aClass240_2;
		synchronized (this.aClass240_2) {
			if (arg0 < 0 || arg0 > this.anInt1422) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method1340(true, arg0, arg2, arg1);
			if (!local37) {
				local37 = this.method1340(false, arg0, arg2, arg1);
			}
			return local37;
		}
	}
}
