import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class8 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!na;")
	private Class44 aClass44_2 = null;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!na;")
	private Class44 aClass44_1 = null;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	private int anInt249 = 65000;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	private final int anInt242;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILclient!na;Lclient!na;I)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3) {
		this.aClass44_1 = arg2;
		this.aClass44_2 = arg1;
		this.anInt242 = arg0;
		this.anInt249 = arg3;
	}

	@OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt242;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BBI)Z")
	public boolean method174(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class44 local11 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			if (arg2 < 0 || arg2 > this.anInt249) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method178(arg0, true, arg2, arg1);
			if (!local37) {
				local37 = this.method178(arg0, false, arg2, arg1);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[B")
	public byte[] method176(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass44_1.method1105()) {
					return null;
				}
				this.aClass44_1.method1101((long) (arg0 * 6));
				this.aClass44_1.method1099(Static77.aByteArray27, 0, 6);
				@Pc(68) int local68 = ((Static77.aByteArray27[4] & 0xFF) << 8) + (((Static77.aByteArray27[3] & 0xFF) << 16) + (Static77.aByteArray27[5] & 0xFF));
				@Pc(90) int local90 = (Static77.aByteArray27[2] & 0xFF) + ((Static77.aByteArray27[1] & 0xFF) << 8) + ((Static77.aByteArray27[0] & 0xFF) << 16);
				if (local90 < 0 || local90 > this.anInt249) {
					return null;
				} else if (local68 > 0 && this.aClass44_2.method1105() / 520L >= (long) local68) {
					@Pc(134) byte[] local134 = new byte[local90];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					label55: while (local136 < local90) {
						if (local68 == 0) {
							return null;
						}
						@Pc(151) int local151 = local90 - local136;
						this.aClass44_2.method1101((long) (local68 * 520));
						if (local151 > 512) {
							local151 = 512;
						}
						this.aClass44_2.method1099(Static77.aByteArray27, 0, local151 + 8);
						@Pc(187) int local187 = (Static77.aByteArray27[1] & 0xFF) + ((Static77.aByteArray27[0] & 0xFF) << 8);
						@Pc(209) int local209 = ((Static77.aByteArray27[4] & 0xFF) << 16) + ((Static77.aByteArray27[5] & 0xFF) << 8) + (Static77.aByteArray27[6] & 0xFF);
						@Pc(215) int local215 = Static77.aByteArray27[7] & 0xFF;
						@Pc(229) int local229 = (Static77.aByteArray27[3] & 0xFF) + ((Static77.aByteArray27[2] & 0xFF) << 8);
						if (arg0 == local187 && local229 == local138 && this.anInt242 == local215) {
							if (local209 >= 0 && (long) local209 <= this.aClass44_2.method1105() / 520L) {
								local138++;
								local68 = local209;
								@Pc(283) int local283 = 0;
								while (true) {
									if (local151 <= local283) {
										continue label55;
									}
									local134[local136++] = Static77.aByteArray27[local283 + 8];
									local283++;
								}
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZII[B)Z")
	private boolean method178(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class44 local8 = this.aClass44_2;
		synchronized (this.aClass44_2) {
			try {
				@Pc(67) int local67;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass44_1.method1105()) {
						return false;
					}
					this.aClass44_1.method1101((long) (arg0 * 6));
					this.aClass44_1.method1099(Static77.aByteArray27, 0, 6);
					local67 = ((Static77.aByteArray27[4] & 0xFF) << 8) + ((Static77.aByteArray27[3] & 0xFF) << 16) + (Static77.aByteArray27[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aClass44_2.method1105() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass44_2.method1105() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static77.aByteArray27[0] = (byte) (arg2 >> 16);
				Static77.aByteArray27[1] = (byte) (arg2 >> 8);
				@Pc(118) int local118 = 0;
				@Pc(120) int local120 = 0;
				Static77.aByteArray27[2] = (byte) arg2;
				Static77.aByteArray27[3] = (byte) (local67 >> 16);
				Static77.aByteArray27[4] = (byte) (local67 >> 8);
				Static77.aByteArray27[5] = (byte) local67;
				this.aClass44_1.method1101((long) (arg0 * 6));
				this.aClass44_1.method1103(6, 0, Static77.aByteArray27);
				while (arg2 > local118) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg1) {
						this.aClass44_2.method1101((long) (local67 * 520));
						try {
							this.aClass44_2.method1099(Static77.aByteArray27, 0, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = (Static77.aByteArray27[1] & 0xFF) + ((Static77.aByteArray27[0] & 0xFF) << 8);
						local172 = (Static77.aByteArray27[6] & 0xFF) + ((Static77.aByteArray27[5] & 0xFF) << 8) + ((Static77.aByteArray27[4] & 0xFF) << 16);
						@Pc(243) int local243 = ((Static77.aByteArray27[2] & 0xFF) << 8) + (Static77.aByteArray27[3] & 0xFF);
						@Pc(249) int local249 = Static77.aByteArray27[7] & 0xFF;
						if (local207 != arg0 || local243 != local120 || this.anInt242 != local249) {
							return false;
						}
						if (local172 < 0 || this.aClass44_2.method1105() / 520L < (long) local172) {
							return false;
						}
					}
					local207 = arg2 - local118;
					if (local207 > 512) {
						local207 = 512;
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass44_2.method1105() + 519L) / 520L);
						if (local172 == 0) {
							local172++;
						}
						arg1 = false;
						if (local67 == local172) {
							local172++;
						}
					}
					if (arg2 - local118 <= 512) {
						local172 = 0;
					}
					Static77.aByteArray27[0] = (byte) (arg0 >> 8);
					Static77.aByteArray27[1] = (byte) arg0;
					Static77.aByteArray27[2] = (byte) (local120 >> 8);
					Static77.aByteArray27[3] = (byte) local120;
					local120++;
					Static77.aByteArray27[4] = (byte) (local172 >> 16);
					Static77.aByteArray27[5] = (byte) (local172 >> 8);
					Static77.aByteArray27[6] = (byte) local172;
					Static77.aByteArray27[7] = (byte) this.anInt242;
					this.aClass44_2.method1101((long) (local67 * 520));
					this.aClass44_2.method1103(8, 0, Static77.aByteArray27);
					local67 = local172;
					this.aClass44_2.method1103(local207, local118, arg3);
					local118 += local207;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}
}
