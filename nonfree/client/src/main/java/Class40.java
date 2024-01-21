import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class40 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	private int anInt1820 = 65000;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!jc;")
	private Class38 aClass38_3 = null;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!jc;")
	private Class38 aClass38_2 = null;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	private final int anInt1829;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILclient!jc;Lclient!jc;I)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3) {
		this.anInt1829 = arg0;
		this.aClass38_3 = arg1;
		this.anInt1820 = arg3;
		this.aClass38_2 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BIBZ)Z")
	private boolean method1171(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class38 local8 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				@Pc(72) int local72;
				if (arg3) {
					if (this.aClass38_2.method1153() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass38_2.method1161((long) (arg2 * 6));
					this.aClass38_2.method1159(0, 6, Static33.aByteArray3);
					local72 = (Static33.aByteArray3[5] & 0xFF) + ((Static33.aByteArray3[3] & 0xFF) << 16) + ((Static33.aByteArray3[4] & 0xFF) << 8);
					if (local72 <= 0 || this.aClass38_3.method1153() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass38_3.method1153() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static33.aByteArray3[0] = (byte) (arg0 >> 16);
				Static33.aByteArray3[2] = (byte) arg0;
				Static33.aByteArray3[5] = (byte) local72;
				Static33.aByteArray3[1] = (byte) (arg0 >> 8);
				Static33.aByteArray3[4] = (byte) (local72 >> 8);
				Static33.aByteArray3[3] = (byte) (local72 >> 16);
				this.aClass38_2.method1161((long) (arg2 * 6));
				@Pc(168) int local168 = 0;
				this.aClass38_2.method1162(6, 0, Static33.aByteArray3);
				@Pc(177) int local177 = 0;
				while (local168 < arg0) {
					@Pc(181) int local181 = 0;
					@Pc(216) int local216;
					if (arg3) {
						this.aClass38_3.method1161((long) (local72 * 520));
						try {
							this.aClass38_3.method1159(0, 8, Static33.aByteArray3);
						} catch (@Pc(200) EOFException local200) {
							return true;
						}
						local216 = (Static33.aByteArray3[1] & 0xFF) + ((Static33.aByteArray3[0] & 0xFF) << 8);
						local181 = ((Static33.aByteArray3[5] & 0xFF) << 8) + ((Static33.aByteArray3[4] & 0xFF) << 16) + (Static33.aByteArray3[6] & 0xFF);
						@Pc(245) int local245 = Static33.aByteArray3[7] & 0xFF;
						@Pc(259) int local259 = (Static33.aByteArray3[3] & 0xFF) + ((Static33.aByteArray3[2] & 0xFF) << 8);
						if (local216 != arg2 || local177 != local259 || this.anInt1829 != local245) {
							return false;
						}
						if (local181 < 0 || (long) local181 > this.aClass38_3.method1153() / 520L) {
							return false;
						}
					}
					local216 = arg0 - local168;
					if (local216 > 512) {
						local216 = 512;
					}
					if (local181 == 0) {
						local181 = (int) ((this.aClass38_3.method1153() + 519L) / 520L);
						arg3 = false;
						if (local181 == 0) {
							local181++;
						}
						if (local72 == local181) {
							local181++;
						}
					}
					if (arg0 - local168 <= 512) {
						local181 = 0;
					}
					Static33.aByteArray3[1] = (byte) arg2;
					Static33.aByteArray3[7] = (byte) this.anInt1829;
					Static33.aByteArray3[4] = (byte) (local181 >> 16);
					Static33.aByteArray3[2] = (byte) (local177 >> 8);
					Static33.aByteArray3[6] = (byte) local181;
					Static33.aByteArray3[0] = (byte) (arg2 >> 8);
					Static33.aByteArray3[3] = (byte) local177;
					local177++;
					Static33.aByteArray3[5] = (byte) (local181 >> 8);
					this.aClass38_3.method1161((long) (local72 * 520));
					this.aClass38_3.method1162(8, 0, Static33.aByteArray3);
					local72 = local181;
					this.aClass38_3.method1162(local216, local168, arg1);
					local168 += local216;
				}
				return true;
			} catch (@Pc(448) IOException local448) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BII)Z")
	public boolean method1173(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class38 local6 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			if (arg2 < 0 || this.anInt1820 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method1171(arg2, arg1, arg0, true);
			if (!local29) {
				local29 = this.method1171(arg2, arg1, arg0, false);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1829;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[B")
	public byte[] method1174(@OriginalArg(0) int arg0) {
		@Pc(8) Class38 local8 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				if (this.aClass38_2.method1153() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass38_2.method1161((long) (arg0 * 6));
				this.aClass38_2.method1159(0, 6, Static33.aByteArray3);
				@Pc(65) int local65 = (Static33.aByteArray3[5] & 0xFF) + ((Static33.aByteArray3[4] & 0xFF) << 8) + ((Static33.aByteArray3[3] & 0xFF) << 16);
				@Pc(88) int local88 = ((Static33.aByteArray3[0] & 0xFF) << 16) - (-((Static33.aByteArray3[1] & 0xFF) << 8) - (Static33.aByteArray3[2] & 0xFF));
				if (local88 < 0 || this.anInt1820 < local88) {
					return null;
				} else if (local65 > 0 && (long) local65 <= this.aClass38_3.method1153() / 520L) {
					@Pc(128) byte[] local128 = new byte[local88];
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					label55: while (local88 > local130) {
						if (local65 == 0) {
							return null;
						}
						this.aClass38_3.method1161((long) (local65 * 520));
						@Pc(163) int local163 = local88 - local130;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass38_3.method1159(0, local163 + 8, Static33.aByteArray3);
						@Pc(191) int local191 = (Static33.aByteArray3[1] & 0xFF) + ((Static33.aByteArray3[0] & 0xFF) << 8);
						@Pc(205) int local205 = ((Static33.aByteArray3[2] & 0xFF) << 8) + (Static33.aByteArray3[3] & 0xFF);
						@Pc(211) int local211 = Static33.aByteArray3[7] & 0xFF;
						@Pc(233) int local233 = ((Static33.aByteArray3[5] & 0xFF) << 8) + ((Static33.aByteArray3[4] & 0xFF) << 16) + (Static33.aByteArray3[6] & 0xFF);
						if (arg0 == local191 && local132 == local205 && local211 == this.anInt1829) {
							if (local233 >= 0 && this.aClass38_3.method1153() / 520L >= (long) local233) {
								local65 = local233;
								local132++;
								@Pc(284) int local284 = 0;
								while (true) {
									if (local163 <= local284) {
										continue label55;
									}
									local128[local130++] = Static33.aByteArray3[local284 + 8];
									local284++;
								}
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(313) IOException local313) {
				return null;
			}
		}
	}
}
