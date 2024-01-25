import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class113 {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!ni;")
	private Class162 aClass162_3 = null;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	private int anInt2997 = 65000;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!ni;")
	private Class162 aClass162_2 = null;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	private final int anInt2989;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILclient!ni;Lclient!ni;I)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3) {
		this.anInt2997 = arg3;
		this.aClass162_3 = arg2;
		this.aClass162_2 = arg1;
		this.anInt2989 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2989;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB[B)Z")
	public boolean method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class162 local6 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			if (arg1 < 0 || this.anInt2997 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method2339(true, arg1, arg0, arg2);
			if (!local33) {
				local33 = this.method2339(false, arg1, arg0, arg2);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)[B")
	public byte[] method2338(@OriginalArg(1) int arg0) {
		@Pc(8) Class162 local8 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass162_3.method3597()) {
					return null;
				}
				this.aClass162_3.method3598((long) (arg0 * 6));
				this.aClass162_3.method3593(6, 0, Static237.aByteArray43);
				@Pc(67) int local67 = ((Static237.aByteArray43[0] & 0xFF) << 16) + ((Static237.aByteArray43[1] & 0xFF) << 8) + (Static237.aByteArray43[2] & 0xFF);
				@Pc(91) int local91 = ((Static237.aByteArray43[3] & 0xFF) << 16) - (-((Static237.aByteArray43[4] & 0xFF) << 8) - (Static237.aByteArray43[5] & 0xFF));
				if (local67 < 0 || this.anInt2997 < local67) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass162_2.method3597() / 520L) {
					@Pc(135) byte[] local135 = new byte[local67];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local137 < local67) {
						if (local91 == 0) {
							return null;
						}
						this.aClass162_2.method3598((long) (local91 * 520));
						@Pc(165) int local165 = local67 - local137;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass162_2.method3593(local165 + 8, 0, Static237.aByteArray43);
						@Pc(194) int local194 = ((Static237.aByteArray43[0] & 0xFF) << 8) + (Static237.aByteArray43[1] & 0xFF);
						@Pc(208) int local208 = (Static237.aByteArray43[3] & 0xFF) + ((Static237.aByteArray43[2] & 0xFF) << 8);
						@Pc(230) int local230 = (Static237.aByteArray43[6] & 0xFF) + ((Static237.aByteArray43[4] & 0xFF) << 16) + ((Static237.aByteArray43[5] & 0xFF) << 8);
						@Pc(236) int local236 = Static237.aByteArray43[7] & 0xFF;
						if (local194 == arg0 && local208 == local139 && this.anInt2989 == local236) {
							if (local230 >= 0 && this.aClass162_2.method3597() / 520L >= (long) local230) {
								local139++;
								for (@Pc(281) int local281 = 0; local281 < local165; local281++) {
									local135[local137++] = Static237.aByteArray43[local281 + 8];
								}
								local91 = local230;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method2339(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class162 local8 = this.aClass162_2;
		synchronized (this.aClass162_2) {
			try {
				@Pc(68) int local68;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass162_3.method3597()) {
						return false;
					}
					this.aClass162_3.method3598((long) (arg2 * 6));
					this.aClass162_3.method3593(6, 0, Static237.aByteArray43);
					local68 = (Static237.aByteArray43[5] & 0xFF) + ((Static237.aByteArray43[3] & 0xFF) << 16) + ((Static237.aByteArray43[4] & 0xFF) << 8);
					if (local68 <= 0 || (long) local68 > this.aClass162_2.method3597() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass162_2.method3597() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static237.aByteArray43[5] = (byte) local68;
				Static237.aByteArray43[3] = (byte) (local68 >> 16);
				Static237.aByteArray43[4] = (byte) (local68 >> 8);
				Static237.aByteArray43[1] = (byte) (arg1 >> 8);
				Static237.aByteArray43[2] = (byte) arg1;
				Static237.aByteArray43[0] = (byte) (arg1 >> 16);
				this.aClass162_3.method3598((long) (arg2 * 6));
				this.aClass162_3.method3599(0, Static237.aByteArray43, 6);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (arg1 > local165) {
					@Pc(171) int local171 = 0;
					@Pc(206) int local206;
					if (arg0) {
						this.aClass162_2.method3598((long) (local68 * 520));
						try {
							this.aClass162_2.method3593(8, 0, Static237.aByteArray43);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local206 = (Static237.aByteArray43[1] & 0xFF) + ((Static237.aByteArray43[0] & 0xFF) << 8);
						local171 = ((Static237.aByteArray43[5] & 0xFF) << 8) + ((Static237.aByteArray43[4] & 0xFF) << 16) + (Static237.aByteArray43[6] & 0xFF);
						@Pc(242) int local242 = (Static237.aByteArray43[3] & 0xFF) + ((Static237.aByteArray43[2] & 0xFF) << 8);
						@Pc(248) int local248 = Static237.aByteArray43[7] & 0xFF;
						if (arg2 != local206 || local167 != local242 || this.anInt2989 != local248) {
							return false;
						}
						if (local171 < 0 || (long) local171 > this.aClass162_2.method3597() / 520L) {
							return false;
						}
					}
					if (local171 == 0) {
						local171 = (int) ((this.aClass162_2.method3597() + 519L) / 520L);
						arg0 = false;
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local68) {
							local171++;
						}
					}
					Static237.aByteArray43[1] = (byte) arg2;
					if (arg1 - local165 <= 512) {
						local171 = 0;
					}
					Static237.aByteArray43[0] = (byte) (arg2 >> 8);
					Static237.aByteArray43[2] = (byte) (local167 >> 8);
					Static237.aByteArray43[3] = (byte) local167;
					Static237.aByteArray43[5] = (byte) (local171 >> 8);
					Static237.aByteArray43[4] = (byte) (local171 >> 16);
					Static237.aByteArray43[7] = (byte) this.anInt2989;
					Static237.aByteArray43[6] = (byte) local171;
					this.aClass162_2.method3598((long) (local68 * 520));
					this.aClass162_2.method3599(0, Static237.aByteArray43, 8);
					local206 = arg1 - local165;
					if (local206 > 512) {
						local206 = 512;
					}
					this.aClass162_2.method3599(local165, arg3, local206);
					local68 = local171;
					local167++;
					local165 += local206;
				}
				return true;
			} catch (@Pc(418) IOException local418) {
				return false;
			}
		}
	}
}
