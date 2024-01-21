import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class14 {

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	private int anInt516 = 65000;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "Lclient!ra;")
	private Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Lclient!ra;")
	private Class56 aClass56_1 = null;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	private final int anInt509;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILclient!ra;Lclient!ra;I)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3) {
		this.anInt516 = arg3;
		this.anInt509 = arg0;
		this.aClass56_1 = arg2;
		this.aClass56_2 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BII)Z")
	public boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class56 local6 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			if (arg0 < 0 || this.anInt516 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method427(arg2, arg0, arg1, true);
			if (!local34) {
				local34 = this.method427(arg2, arg0, arg1, false);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[B")
	public byte[] method426(@OriginalArg(0) int arg0) {
		@Pc(8) Class56 local8 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass56_1.method1564()) {
					return null;
				}
				this.aClass56_1.method1565((long) (arg0 * 6));
				this.aClass56_1.method1563(Static70.aByteArray17, 6, 0);
				@Pc(65) int local65 = ((Static70.aByteArray17[0] & 0xFF) << 16) + ((Static70.aByteArray17[1] & 0xFF) << 8) + (Static70.aByteArray17[2] & 0xFF);
				@Pc(88) int local88 = ((Static70.aByteArray17[3] & 0xFF) << 16) + ((Static70.aByteArray17[4] << 8 & 0xFF00) + (Static70.aByteArray17[5] & 0xFF));
				if (local65 < 0 || this.anInt516 < local65) {
					return null;
				} else if (local88 > 0 && this.aClass56_2.method1564() / 520L >= (long) local88) {
					@Pc(134) byte[] local134 = new byte[local65];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local138 < local65) {
						if (local88 == 0) {
							return null;
						}
						@Pc(163) int local163 = local65 - local138;
						this.aClass56_2.method1565((long) (local88 * 520));
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass56_2.method1563(Static70.aByteArray17, local163 + 8, 0);
						@Pc(201) int local201 = (Static70.aByteArray17[3] & 0xFF) + ((Static70.aByteArray17[2] & 0xFF) << 8);
						@Pc(215) int local215 = (Static70.aByteArray17[1] & 0xFF) + ((Static70.aByteArray17[0] & 0xFF) << 8);
						@Pc(221) int local221 = Static70.aByteArray17[7] & 0xFF;
						@Pc(243) int local243 = (Static70.aByteArray17[6] & 0xFF) + ((Static70.aByteArray17[4] & 0xFF) << 16) + ((Static70.aByteArray17[5] & 0xFF) << 8);
						if (arg0 == local215 && local201 == local136 && local221 == this.anInt509) {
							if (local243 >= 0 && this.aClass56_2.method1564() / 520L >= (long) local243) {
								local88 = local243;
								for (@Pc(281) int local281 = 0; local281 < local163; local281++) {
									local134[local138++] = Static70.aByteArray17[local281 + 8];
								}
								local136++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[BZB)Z")
	private boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class56 local8 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				@Pc(72) int local72;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass56_1.method1564()) {
						return false;
					}
					this.aClass56_1.method1565((long) (arg0 * 6));
					this.aClass56_1.method1563(Static70.aByteArray17, 6, 0);
					local72 = ((Static70.aByteArray17[4] & 0xFF) << 8) + ((Static70.aByteArray17[3] & 0xFF) << 16) + (Static70.aByteArray17[5] & 0xFF);
					if (local72 <= 0 || this.aClass56_2.method1564() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass56_2.method1564() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static70.aByteArray17[3] = (byte) (local72 >> 16);
				Static70.aByteArray17[5] = (byte) local72;
				Static70.aByteArray17[0] = (byte) (arg1 >> 16);
				Static70.aByteArray17[1] = (byte) (arg1 >> 8);
				@Pc(138) int local138 = 0;
				@Pc(140) int local140 = 0;
				Static70.aByteArray17[2] = (byte) arg1;
				Static70.aByteArray17[4] = (byte) (local72 >> 8);
				this.aClass56_1.method1565((long) (arg0 * 6));
				this.aClass56_1.method1568(6, 0, Static70.aByteArray17);
				while (arg1 > local138) {
					@Pc(176) int local176 = 0;
					@Pc(234) int local234;
					if (arg3) {
						this.aClass56_2.method1565((long) (local72 * 520));
						try {
							this.aClass56_2.method1563(Static70.aByteArray17, 8, 0);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local176 = ((Static70.aByteArray17[4] & 0xFF) << 16) + (((Static70.aByteArray17[5] & 0xFF) << 8) + (Static70.aByteArray17[6] & 0xFF));
						local234 = (Static70.aByteArray17[1] & 0xFF) + ((Static70.aByteArray17[0] & 0xFF) << 8);
						@Pc(240) int local240 = Static70.aByteArray17[7] & 0xFF;
						@Pc(254) int local254 = (Static70.aByteArray17[3] & 0xFF) + ((Static70.aByteArray17[2] & 0xFF) << 8);
						if (arg0 != local234 || local140 != local254 || local240 != this.anInt509) {
							return false;
						}
						if (local176 < 0 || (long) local176 > this.aClass56_2.method1564() / 520L) {
							return false;
						}
					}
					if (local176 == 0) {
						arg3 = false;
						local176 = (int) ((this.aClass56_2.method1564() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local72 == local176) {
							local176++;
						}
					}
					if (arg1 - local138 <= 512) {
						local176 = 0;
					}
					Static70.aByteArray17[2] = (byte) (local140 >> 8);
					Static70.aByteArray17[5] = (byte) (local176 >> 8);
					Static70.aByteArray17[6] = (byte) local176;
					Static70.aByteArray17[0] = (byte) (arg0 >> 8);
					local234 = arg1 - local138;
					Static70.aByteArray17[4] = (byte) (local176 >> 16);
					if (local234 > 512) {
						local234 = 512;
					}
					Static70.aByteArray17[3] = (byte) local140;
					local140++;
					Static70.aByteArray17[1] = (byte) arg0;
					Static70.aByteArray17[7] = (byte) this.anInt509;
					this.aClass56_2.method1565((long) (local72 * 520));
					local72 = local176;
					this.aClass56_2.method1568(8, 0, Static70.aByteArray17);
					this.aClass56_2.method1568(local234, local138, arg2);
					local138 += local234;
				}
				return true;
			} catch (@Pc(444) IOException local444) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt509;
	}
}
