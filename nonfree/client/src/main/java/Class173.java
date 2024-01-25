import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class173 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ge;")
	private Class69 aClass69_5 = null;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!ge;")
	private Class69 aClass69_6 = null;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	private int anInt5092 = 65000;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	private final int anInt5087;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILclient!ge;Lclient!ge;I)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) int arg3) {
		this.anInt5087 = arg0;
		this.aClass69_5 = arg2;
		this.anInt5092 = arg3;
		this.aClass69_6 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method4613(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class69 local8 = this.aClass69_6;
		synchronized (this.aClass69_6) {
			try {
				@Pc(67) int local67;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass69_5.method1919()) {
						return false;
					}
					this.aClass69_5.method1917((long) (arg2 * 6));
					this.aClass69_5.method1918(Static71.aByteArray21, 6, 0);
					local67 = ((Static71.aByteArray21[3] & 0xFF) << 16) + ((Static71.aByteArray21[4] & 0xFF) << 8) + (Static71.aByteArray21[5] & 0xFF);
					if (local67 <= 0 || this.aClass69_6.method1919() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass69_6.method1919() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static71.aByteArray21[3] = (byte) (local67 >> 16);
				Static71.aByteArray21[5] = (byte) local67;
				Static71.aByteArray21[4] = (byte) (local67 >> 8);
				Static71.aByteArray21[0] = (byte) (arg0 >> 16);
				Static71.aByteArray21[2] = (byte) arg0;
				Static71.aByteArray21[1] = (byte) (arg0 >> 8);
				this.aClass69_5.method1917((long) (arg2 * 6));
				this.aClass69_5.method1916(Static71.aByteArray21, 0, 6);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (local165 < arg0) {
					@Pc(171) int local171 = 0;
					@Pc(206) int local206;
					if (arg3) {
						this.aClass69_6.method1917((long) (local67 * 520));
						try {
							this.aClass69_6.method1918(Static71.aByteArray21, 8, 0);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local206 = (Static71.aByteArray21[1] & 0xFF) + ((Static71.aByteArray21[0] & 0xFF) << 8);
						local171 = (Static71.aByteArray21[6] & 0xFF) + ((Static71.aByteArray21[4] & 0xFF) << 16) + ((Static71.aByteArray21[5] & 0xFF) << 8);
						@Pc(243) int local243 = ((Static71.aByteArray21[2] & 0xFF) << 8) + (Static71.aByteArray21[3] & 0xFF);
						@Pc(249) int local249 = Static71.aByteArray21[7] & 0xFF;
						if (local206 != arg2 || local243 != local167 || this.anInt5087 != local249) {
							return false;
						}
						if (local171 < 0 || (long) local171 > this.aClass69_6.method1919() / 520L) {
							return false;
						}
					}
					if (local171 == 0) {
						arg3 = false;
						local171 = (int) ((this.aClass69_6.method1919() + 519L) / 520L);
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local67) {
							local171++;
						}
					}
					if (arg0 - local165 <= 512) {
						local171 = 0;
					}
					Static71.aByteArray21[0] = (byte) (arg2 >> 8);
					Static71.aByteArray21[2] = (byte) (local167 >> 8);
					Static71.aByteArray21[3] = (byte) local167;
					Static71.aByteArray21[1] = (byte) arg2;
					Static71.aByteArray21[5] = (byte) (local171 >> 8);
					Static71.aByteArray21[4] = (byte) (local171 >> 16);
					Static71.aByteArray21[6] = (byte) local171;
					Static71.aByteArray21[7] = (byte) this.anInt5087;
					this.aClass69_6.method1917((long) (local67 * 520));
					this.aClass69_6.method1916(Static71.aByteArray21, 0, 8);
					local206 = arg0 - local165;
					if (local206 > 512) {
						local206 = 512;
					}
					this.aClass69_6.method1916(arg1, local165, local206);
					local165 += local206;
					local167++;
					local67 = local171;
				}
				return true;
			} catch (@Pc(410) IOException local410) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BII)Z")
	public boolean method4614(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class69 local6 = this.aClass69_6;
		synchronized (this.aClass69_6) {
			if (arg2 < 0 || arg2 > this.anInt5092) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method4613(arg2, arg0, arg1, true);
			if (!local39) {
				local39 = this.method4613(arg2, arg0, arg1, false);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[B")
	public byte[] method4615(@OriginalArg(0) int arg0) {
		@Pc(8) Class69 local8 = this.aClass69_6;
		synchronized (this.aClass69_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass69_5.method1919()) {
					return null;
				}
				this.aClass69_5.method1917((long) (arg0 * 6));
				this.aClass69_5.method1918(Static71.aByteArray21, 6, 0);
				@Pc(66) int local66 = ((Static71.aByteArray21[0] & 0xFF) << 16) + ((Static71.aByteArray21[1] & 0xFF) << 8) + (Static71.aByteArray21[2] & 0xFF);
				@Pc(90) int local90 = ((Static71.aByteArray21[3] & 0xFF) << 16) - (-((Static71.aByteArray21[4] & 0xFF) << 8) - (Static71.aByteArray21[5] & 0xFF));
				if (local66 < 0 || this.anInt5092 < local66) {
					return null;
				} else if (local90 > 0 && (long) local90 <= this.aClass69_6.method1919() / 520L) {
					@Pc(127) byte[] local127 = new byte[local66];
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					while (local66 > local129) {
						if (local90 == 0) {
							return null;
						}
						this.aClass69_6.method1917((long) (local90 * 520));
						@Pc(160) int local160 = local66 - local129;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass69_6.method1918(Static71.aByteArray21, local160 + 8, 0);
						@Pc(188) int local188 = (Static71.aByteArray21[1] & 0xFF) + ((Static71.aByteArray21[0] & 0xFF) << 8);
						@Pc(202) int local202 = ((Static71.aByteArray21[2] & 0xFF) << 8) + (Static71.aByteArray21[3] & 0xFF);
						@Pc(225) int local225 = ((Static71.aByteArray21[4] & 0xFF) << 16) - (-((Static71.aByteArray21[5] & 0xFF) << 8) - (Static71.aByteArray21[6] & 0xFF));
						@Pc(231) int local231 = Static71.aByteArray21[7] & 0xFF;
						if (arg0 == local188 && local202 == local131 && local231 == this.anInt5087) {
							if (local225 >= 0 && this.aClass69_6.method1919() / 520L >= (long) local225) {
								for (@Pc(270) int local270 = 0; local270 < local160; local270++) {
									local127[local129++] = Static71.aByteArray21[local270 + 8];
								}
								local90 = local225;
								local131++;
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
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5087;
	}
}
