import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class56 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	private int anInt1886 = 65000;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!dd;")
	private Class16 aClass16_9 = null;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "Lclient!dd;")
	private Class16 aClass16_10 = null;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	private final int anInt1889;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILclient!dd;Lclient!dd;I)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3) {
		this.aClass16_10 = arg2;
		this.anInt1889 = arg0;
		this.aClass16_9 = arg1;
		this.anInt1886 = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BBZI)Z")
	private boolean method1268(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class16 local8 = this.aClass16_9;
		synchronized (this.aClass16_9) {
			try {
				@Pc(67) int local67;
				if (arg2) {
					if (this.aClass16_10.method428() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass16_10.method431((long) (arg0 * 6));
					this.aClass16_10.method432(Static87.aByteArray22, 0, 6);
					local67 = ((Static87.aByteArray22[4] & 0xFF) << 8) + (Static87.aByteArray22[3] << 16 & 0xFF0000) + (Static87.aByteArray22[5] & 0xFF);
					if (local67 <= 0 || this.aClass16_9.method428() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass16_9.method428() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static87.aByteArray22[5] = (byte) local67;
				Static87.aByteArray22[0] = (byte) (arg3 >> 16);
				Static87.aByteArray22[4] = (byte) (local67 >> 8);
				Static87.aByteArray22[1] = (byte) (arg3 >> 8);
				Static87.aByteArray22[2] = (byte) arg3;
				Static87.aByteArray22[3] = (byte) (local67 >> 16);
				@Pc(147) int local147 = 0;
				this.aClass16_10.method431((long) (arg0 * 6));
				@Pc(157) int local157 = 0;
				this.aClass16_10.method425(6, Static87.aByteArray22, 0);
				while (local157 < arg3) {
					@Pc(168) int local168 = 0;
					@Pc(239) int local239;
					if (arg2) {
						this.aClass16_9.method431((long) (local67 * 520));
						try {
							this.aClass16_9.method432(Static87.aByteArray22, 0, 8);
						} catch (@Pc(187) EOFException local187) {
							return true;
						}
						local168 = ((Static87.aByteArray22[5] & 0xFF) << 8) + ((Static87.aByteArray22[4] & 0xFF) << 16) + (Static87.aByteArray22[6] & 0xFF);
						@Pc(225) int local225 = (Static87.aByteArray22[3] & 0xFF) + ((Static87.aByteArray22[2] & 0xFF) << 8);
						local239 = ((Static87.aByteArray22[0] & 0xFF) << 8) + (Static87.aByteArray22[1] & 0xFF);
						@Pc(245) int local245 = Static87.aByteArray22[7] & 0xFF;
						if (local239 != arg0 || local147 != local225 || local245 != this.anInt1889) {
							return false;
						}
						if (local168 < 0 || this.aClass16_9.method428() / 520L < (long) local168) {
							return false;
						}
					}
					if (local168 == 0) {
						local168 = (int) ((this.aClass16_9.method428() + 519L) / 520L);
						arg2 = false;
						if (local168 == 0) {
							local168++;
						}
						if (local168 == local67) {
							local168++;
						}
					}
					Static87.aByteArray22[2] = (byte) (local147 >> 8);
					Static87.aByteArray22[3] = (byte) local147;
					if (arg3 - local157 <= 512) {
						local168 = 0;
					}
					Static87.aByteArray22[7] = (byte) this.anInt1889;
					Static87.aByteArray22[0] = (byte) (arg0 >> 8);
					Static87.aByteArray22[1] = (byte) arg0;
					Static87.aByteArray22[4] = (byte) (local168 >> 16);
					Static87.aByteArray22[6] = (byte) local168;
					local147++;
					Static87.aByteArray22[5] = (byte) (local168 >> 8);
					local239 = arg3 - local157;
					this.aClass16_9.method431((long) (local67 * 520));
					if (local239 > 512) {
						local239 = 512;
					}
					local67 = local168;
					this.aClass16_9.method425(8, Static87.aByteArray22, 0);
					this.aClass16_9.method425(local239, arg1, local157);
					local157 += local239;
				}
				return true;
			} catch (@Pc(423) IOException local423) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)[B")
	public byte[] method1269(@OriginalArg(0) int arg0) {
		@Pc(8) Class16 local8 = this.aClass16_9;
		synchronized (this.aClass16_9) {
			try {
				if (this.aClass16_10.method428() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass16_10.method431((long) (arg0 * 6));
				this.aClass16_10.method432(Static87.aByteArray22, 0, 6);
				@Pc(74) int local74 = ((Static87.aByteArray22[1] & 0xFF) << 8) + ((Static87.aByteArray22[0] & 0xFF) << 16) + (Static87.aByteArray22[2] & 0xFF);
				@Pc(96) int local96 = ((Static87.aByteArray22[4] & 0xFF) << 8) + ((Static87.aByteArray22[3] & 0xFF) << 16) + (Static87.aByteArray22[5] & 0xFF);
				if (local74 < 0 || local74 > this.anInt1886) {
					return null;
				} else if (local96 > 0 && (long) local96 <= this.aClass16_9.method428() / 520L) {
					@Pc(128) int local128 = 0;
					@Pc(131) byte[] local131 = new byte[local74];
					@Pc(133) int local133 = 0;
					while (local128 < local74) {
						if (local96 == 0) {
							return null;
						}
						this.aClass16_9.method431((long) (local96 * 520));
						@Pc(156) int local156 = local74 - local128;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass16_9.method432(Static87.aByteArray22, 0, local156 + 8);
						@Pc(185) int local185 = ((Static87.aByteArray22[0] & 0xFF) << 8) + (Static87.aByteArray22[1] & 0xFF);
						@Pc(199) int local199 = (Static87.aByteArray22[3] & 0xFF) + ((Static87.aByteArray22[2] & 0xFF) << 8);
						@Pc(222) int local222 = ((Static87.aByteArray22[4] & 0xFF) << 16) + ((Static87.aByteArray22[5] & 0xFF) << 8) + (Static87.aByteArray22[6] & 0xFF);
						@Pc(228) int local228 = Static87.aByteArray22[7] & 0xFF;
						if (local185 == arg0 && local133 == local199 && this.anInt1889 == local228) {
							if (local222 >= 0 && this.aClass16_9.method428() / 520L >= (long) local222) {
								local133++;
								for (@Pc(276) int local276 = 0; local276 < local156; local276++) {
									local131[local128++] = Static87.aByteArray22[local276 + 8];
								}
								local96 = local222;
								continue;
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[B)Z")
	public boolean method1272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class16 local6 = this.aClass16_9;
		synchronized (this.aClass16_9) {
			if (arg1 < 0 || this.anInt1886 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1268(arg0, arg2, true, arg1);
			if (!local33) {
				local33 = this.method1268(arg0, arg2, false, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!nf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1889;
	}
}
