import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class133 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	private int anInt4272 = 65000;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!fm;")
	private Class57 aClass57_5 = null;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!fm;")
	private Class57 aClass57_4 = null;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	private int anInt4264;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!fm;Lclient!fm;I)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3) {
		this.anInt4264 = arg0;
		this.aClass57_4 = arg1;
		this.aClass57_5 = arg2;
		this.anInt4272 = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4264;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BIII)Z")
	public boolean method3269(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class57 local7 = this.aClass57_4;
		synchronized (this.aClass57_4) {
			if (arg1 < 0 || arg1 > this.anInt4272) {
				throw new IllegalArgumentException();
			}
			@Pc(44) boolean local44 = this.method3272(true, arg0, arg2, arg1);
			if (!local44) {
				local44 = this.method3272(false, arg0, arg2, arg1);
			}
			return local44;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[BIBI)Z")
	private boolean method3272(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class57 local9 = this.aClass57_4;
		synchronized (this.aClass57_4) {
			try {
				@Pc(69) int local69;
				@Pc(29) boolean local29;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass57_5.method1351()) {
						local29 = false;
						return local29;
					}
					this.aClass57_5.method1347((long) (arg2 * 6));
					this.aClass57_5.method1350(0, 6, Static44.aByteArray6);
					local69 = (Static44.aByteArray6[5] & 0xFF) + ((Static44.aByteArray6[3] & 0xFF) << 16) + ((Static44.aByteArray6[4] & 0xFF) << 8);
					if (local69 <= 0 || this.aClass57_4.method1351() / 520L < (long) local69) {
						local29 = false;
						return local29;
					}
				} else {
					local69 = (int) ((this.aClass57_4.method1351() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static44.aByteArray6[3] = (byte) (local69 >> 16);
				Static44.aByteArray6[1] = (byte) (arg3 >> 8);
				Static44.aByteArray6[0] = (byte) (arg3 >> 16);
				@Pc(127) int local127 = 0;
				Static44.aByteArray6[5] = (byte) local69;
				@Pc(134) int local134 = 0;
				Static44.aByteArray6[2] = (byte) arg3;
				Static44.aByteArray6[4] = (byte) (local69 >> 8);
				this.aClass57_5.method1347((long) (arg2 * 6));
				this.aClass57_5.method1344(6, Static44.aByteArray6, 0);
				while (true) {
					if (local134 < arg3) {
						label133: {
							@Pc(175) int local175 = 0;
							@Pc(234) int local234;
							if (arg0) {
								this.aClass57_4.method1347((long) (local69 * 520));
								try {
									this.aClass57_4.method1350(0, 8, Static44.aByteArray6);
								} catch (@Pc(194) EOFException local194) {
									break label133;
								}
								local175 = (Static44.aByteArray6[6] & 0xFF) + (((Static44.aByteArray6[4] & 0xFF) << 16) + ((Static44.aByteArray6[5] & 0xFF) << 8));
								local234 = ((Static44.aByteArray6[0] & 0xFF) << 8) + (Static44.aByteArray6[1] & 0xFF);
								@Pc(248) int local248 = (Static44.aByteArray6[3] & 0xFF) + ((Static44.aByteArray6[2] & 0xFF) << 8);
								@Pc(254) int local254 = Static44.aByteArray6[7] & 0xFF;
								if (local234 != arg2 || local127 != local248 || local254 != this.anInt4264) {
									local29 = false;
									return local29;
								}
								if (local175 < 0 || (long) local175 > this.aClass57_4.method1351() / 520L) {
									local29 = false;
									return local29;
								}
							}
							if (local175 == 0) {
								local175 = (int) ((this.aClass57_4.method1351() + 519L) / 520L);
								if (local175 == 0) {
									local175++;
								}
								arg0 = false;
								if (local69 == local175) {
									local175++;
								}
							}
							Static44.aByteArray6[1] = (byte) arg2;
							if (arg3 - local134 <= 512) {
								local175 = 0;
							}
							Static44.aByteArray6[0] = (byte) (arg2 >> 8);
							Static44.aByteArray6[2] = (byte) (local127 >> 8);
							Static44.aByteArray6[4] = (byte) (local175 >> 16);
							Static44.aByteArray6[3] = (byte) local127;
							Static44.aByteArray6[7] = (byte) this.anInt4264;
							Static44.aByteArray6[6] = (byte) local175;
							Static44.aByteArray6[5] = (byte) (local175 >> 8);
							this.aClass57_4.method1347((long) (local69 * 520));
							local234 = arg3 - local134;
							if (local234 > 512) {
								local234 = 512;
							}
							local69 = local175;
							local127++;
							this.aClass57_4.method1344(8, Static44.aByteArray6, 0);
							this.aClass57_4.method1344(local234, arg1, local134);
							local134 += local234;
							continue;
						}
					}
					local29 = true;
					return local29;
				}
			} catch (@Pc(431) IOException local431) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[B")
	public byte[] method3273(@OriginalArg(0) int arg0) {
		@Pc(9) Class57 local9 = this.aClass57_4;
		synchronized (this.aClass57_4) {
			try {
				@Pc(23) Object local23;
				if ((long) (arg0 * 6 + 6) > this.aClass57_5.method1351()) {
					local23 = null;
					return (byte[]) local23;
				}
				this.aClass57_5.method1347((long) (arg0 * 6));
				this.aClass57_5.method1350(0, 6, Static44.aByteArray6);
				@Pc(64) int local64 = ((Static44.aByteArray6[1] & 0xFF) << 8) + ((Static44.aByteArray6[0] & 0xFF) << 16) + (Static44.aByteArray6[2] & 0xFF);
				@Pc(87) int local87 = ((Static44.aByteArray6[3] & 0xFF) << 16) - (-((Static44.aByteArray6[4] & 0xFF) << 8) - (Static44.aByteArray6[5] & 0xFF));
				if (local64 < 0 || this.anInt4272 < local64) {
					local23 = null;
					return (byte[]) local23;
				} else if (local87 <= 0 || this.aClass57_4.method1351() / 520L < (long) local87) {
					local23 = null;
					return (byte[]) local23;
				} else {
					@Pc(125) int local125 = 0;
					@Pc(128) byte[] local128 = new byte[local64];
					@Pc(130) int local130 = 0;
					while (local125 < local64) {
						if (local87 == 0) {
							local23 = null;
							return (byte[]) local23;
						}
						this.aClass57_4.method1347((long) (local87 * 520));
						@Pc(155) int local155 = local64 - local125;
						if (local155 > 512) {
							local155 = 512;
						}
						this.aClass57_4.method1350(0, local155 + 8, Static44.aByteArray6);
						@Pc(184) int local184 = (Static44.aByteArray6[3] & 0xFF) + ((Static44.aByteArray6[2] & 0xFF) << 8);
						@Pc(190) int local190 = Static44.aByteArray6[7] & 0xFF;
						@Pc(212) int local212 = (Static44.aByteArray6[6] & 0xFF) + ((Static44.aByteArray6[4] & 0xFF) << 16) + ((Static44.aByteArray6[5] & 0xFF) << 8);
						@Pc(227) int local227 = ((Static44.aByteArray6[0] & 0xFF) << 8) + (Static44.aByteArray6[1] & 0xFF);
						if (local227 == arg0 && local130 == local184 && local190 == this.anInt4264) {
							if (local212 >= 0 && (long) local212 <= this.aClass57_4.method1351() / 520L) {
								local130++;
								for (@Pc(263) int local263 = 0; local263 < local155; local263++) {
									local128[local125++] = Static44.aByteArray6[local263 + 8];
								}
								local87 = local212;
								continue;
							}
							local23 = null;
							return (byte[]) local23;
						}
						local23 = null;
						return (byte[]) local23;
					}
					@Pc(283) byte[] local283 = local128;
					return local283;
				}
			} catch (@Pc(287) IOException local287) {
				return null;
			}
		}
	}
}
