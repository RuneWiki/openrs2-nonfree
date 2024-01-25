import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class196 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "F")
	public float aFloat123 = 0.25F;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "F")
	public float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "F")
	public float aFloat124 = 1.0F;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "F")
	public final float aFloat122;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public final int anInt5066;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "F")
	public final float aFloat126;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public final int anInt5065;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public final int anInt5071;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public final int anInt5064;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!bn;")
	public final Class24 aClass24_3;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "F")
	public final float aFloat121;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class196() {
		this.aFloat122 = 0.69921875F;
		this.anInt5066 = -60;
		this.anInt5076 = Static331.anInt5294;
		this.aFloat126 = 1.2F;
		this.anInt5065 = -50;
		this.anInt5071 = -50;
		this.anInt5064 = 0;
		this.anInt5074 = Static226.anInt3766;
		this.aClass24_3 = Static191.aClass24_1;
		this.aFloat121 = 1.1523438F;
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class196(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method5539();
		if (Static216.aClass1_Sub1_1.method3579(Static146.anInt2644) && Static348.aClass200_7.method5852() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5076 = Static331.anInt5294;
			} else {
				this.anInt5076 = arg0.method5603();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat121 = 1.1523438F;
			} else {
				this.aFloat121 = (float) arg0.method5598() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat122 = 0.69921875F;
			} else {
				this.aFloat122 = (float) arg0.method5598() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat126 = 1.2F;
			} else {
				this.aFloat126 = (float) arg0.method5598() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5603();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5598();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5598();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5598();
			}
			this.aFloat126 = 1.2F;
			this.anInt5076 = Static331.anInt5294;
			this.aFloat121 = 1.1523438F;
			this.aFloat122 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5066 = -60;
			this.anInt5065 = -50;
			this.anInt5071 = -50;
		} else {
			this.anInt5071 = arg0.method5586();
			this.anInt5066 = arg0.method5586();
			this.anInt5065 = arg0.method5586();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5074 = Static226.anInt3766;
		} else {
			this.anInt5074 = arg0.method5603();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5064 = 0;
		} else {
			this.anInt5064 = arg0.method5598();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass24_3 = Static191.aClass24_1;
		} else {
			@Pc(220) int local220 = arg0.method5598();
			@Pc(224) int local224 = arg0.method5598();
			@Pc(228) int local228 = arg0.method5598();
			@Pc(232) int local232 = arg0.method5598();
			@Pc(236) int local236 = arg0.method5598();
			@Pc(240) int local240 = arg0.method5598();
			this.aClass24_3 = Static32.method545(local224, local240, local220, local236, local232, local228);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method4005(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aFloat125 = (float) (arg0.method5539() * 8) / 255.0F;
		this.aFloat123 = (float) (arg0.method5539() * 8) / 255.0F;
		this.aFloat124 = (float) (arg0.method5539() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!pq;)Z")
	public boolean method4007(@OriginalArg(1) Class196 arg0) {
		return arg0.anInt5076 == this.anInt5076 && arg0.aFloat121 == this.aFloat121 && arg0.aFloat122 == this.aFloat122 && this.aFloat126 == arg0.aFloat126 && this.aFloat123 == arg0.aFloat123 && arg0.aFloat125 == this.aFloat125 && arg0.aFloat124 == this.aFloat124 && arg0.anInt5074 == this.anInt5074 && this.anInt5064 == arg0.anInt5064 && arg0.aClass24_3 == this.aClass24_3;
	}
}
