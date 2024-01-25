import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class283 {

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "F")
	public float aFloat144 = 0.25F;

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "F")
	public float aFloat145 = 1.0F;

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "F")
	public float aFloat146 = 1.0F;

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
	public final int anInt7339;

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "I")
	public final int anInt7335;

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
	public final int anInt7343;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "F")
	public final float aFloat141;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
	public final int anInt7340;

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "I")
	public final int anInt7341;

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "F")
	public final float aFloat143;

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
	public final int anInt7336;

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "F")
	public final float aFloat142;

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "Lclient!lia;")
	public final Class185 aClass185_2;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V")
	public Class283() {
		this.anInt7339 = -60;
		this.anInt7335 = -50;
		this.anInt7343 = Static74.anInt1314;
		this.aFloat141 = 1.2F;
		this.anInt7340 = -50;
		this.anInt7341 = Static458.anInt7395;
		this.aFloat143 = 0.69921875F;
		this.anInt7336 = 0;
		this.aFloat142 = 1.1523438F;
		this.aClass185_2 = Static512.aClass185_3;
	}

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class283(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(16) int local16 = arg0.method7291();
		if (Static577.aClass5_Sub19_25.aClass17_Sub23_1.method7699() == 1 && Static437.aClass100_10.method8635() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7343 = Static74.anInt1314;
			} else {
				this.anInt7343 = arg0.method7268();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat142 = 1.1523438F;
			} else {
				this.aFloat142 = (float) arg0.method7333() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat143 = 0.69921875F;
			} else {
				this.aFloat143 = (float) arg0.method7333() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat141 = 1.2F;
			} else {
				this.aFloat141 = (float) arg0.method7333() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method7268();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method7333();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method7333();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method7333();
			}
			this.aFloat143 = 0.69921875F;
			this.anInt7343 = Static74.anInt1314;
			this.aFloat141 = 1.2F;
			this.aFloat142 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7340 = -50;
			this.anInt7335 = -50;
			this.anInt7339 = -60;
		} else {
			this.anInt7340 = arg0.method7303();
			this.anInt7339 = arg0.method7303();
			this.anInt7335 = arg0.method7303();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7341 = Static458.anInt7395;
		} else {
			this.anInt7341 = arg0.method7268();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7336 = 0;
		} else {
			this.anInt7336 = arg0.method7333();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass185_2 = Static512.aClass185_3;
		} else {
			@Pc(269) int local269 = arg0.method7333();
			@Pc(273) int local273 = arg0.method7333();
			@Pc(277) int local277 = arg0.method7333();
			@Pc(281) int local281 = arg0.method7333();
			@Pc(285) int local285 = arg0.method7333();
			@Pc(289) int local289 = arg0.method7333();
			this.aClass185_2 = Static263.method4284(local269, local273, local277, local281, local289, local285);
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!pea;)Z")
	public boolean method6390(@OriginalArg(1) Class283 arg0) {
		return this.anInt7343 == arg0.anInt7343 && arg0.aFloat142 == this.aFloat142 && this.aFloat143 == arg0.aFloat143 && arg0.aFloat141 == this.aFloat141 && this.aFloat144 == arg0.aFloat144 && this.aFloat146 == arg0.aFloat146 && this.aFloat145 == arg0.aFloat145 && this.anInt7341 == arg0.anInt7341 && this.anInt7336 == arg0.anInt7336 && arg0.aClass185_2 == this.aClass185_2;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method6391(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aFloat146 = (float) (arg0.method7291() * 8) / 255.0F;
		this.aFloat144 = (float) (arg0.method7291() * 8) / 255.0F;
		this.aFloat145 = (float) (arg0.method7291() * 8) / 255.0F;
	}
}
