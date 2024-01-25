import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class216 {

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "F")
	public float aFloat134 = 0.25F;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "F")
	public float aFloat133 = 1.0F;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "F")
	public float aFloat135 = 1.0F;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "F")
	public final float aFloat130;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "F")
	public final float aFloat132;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "F")
	public final float aFloat129;

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	public final int anInt6832;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
	public final int anInt6823;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Lclient!km;")
	public final Class40 aClass40_3;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
	public final int anInt6825;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
	public final int anInt6828;

	@OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
	public final int anInt6833;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
	public final int anInt6827;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V")
	public Class216() {
		this.aFloat130 = 1.2F;
		this.aFloat132 = 0.69921875F;
		this.aFloat129 = 1.1523438F;
		this.anInt6832 = -50;
		this.anInt6823 = 0;
		this.aClass40_3 = Static542.aClass40_4;
		this.anInt6825 = Static618.anInt10388;
		this.anInt6828 = -60;
		this.anInt6833 = Static487.anInt8673;
		this.anInt6827 = -50;
	}

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class216(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method8525();
		if (Static155.aClass8_Sub25_6.aClass36_Sub21_1.method6959() == 1 && Static274.aClass16_12.method6074() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6833 = Static487.anInt8673;
			} else {
				this.anInt6833 = arg0.method8540();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat129 = 1.1523438F;
			} else {
				this.aFloat129 = (float) arg0.method8578() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat132 = 0.69921875F;
			} else {
				this.aFloat132 = (float) arg0.method8578() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat130 = 1.2F;
			} else {
				this.aFloat130 = (float) arg0.method8578() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8540();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8578();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8578();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8578();
			}
			this.aFloat129 = 1.1523438F;
			this.aFloat132 = 0.69921875F;
			this.aFloat130 = 1.2F;
			this.anInt6833 = Static487.anInt8673;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6828 = -60;
			this.anInt6832 = -50;
			this.anInt6827 = -50;
		} else {
			this.anInt6832 = arg0.method8568();
			this.anInt6828 = arg0.method8568();
			this.anInt6827 = arg0.method8568();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6825 = Static618.anInt10388;
		} else {
			this.anInt6825 = arg0.method8540();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6823 = 0;
		} else {
			this.anInt6823 = arg0.method8578();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass40_3 = Static542.aClass40_4;
		} else {
			@Pc(220) int local220 = arg0.method8578();
			@Pc(224) int local224 = arg0.method8578();
			@Pc(228) int local228 = arg0.method8578();
			@Pc(232) int local232 = arg0.method8578();
			@Pc(236) int local236 = arg0.method8578();
			@Pc(240) int local240 = arg0.method8578();
			this.aClass40_3 = Static287.method4819(local228, local236, local224, local240, local232, local220);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!naa;B)Z")
	public boolean method5606(@OriginalArg(0) Class216 arg0) {
		return this.anInt6833 == arg0.anInt6833 && arg0.aFloat129 == this.aFloat129 && arg0.aFloat132 == this.aFloat132 && arg0.aFloat130 == this.aFloat130 && this.aFloat134 == arg0.aFloat134 && arg0.aFloat135 == this.aFloat135 && arg0.aFloat133 == this.aFloat133 && arg0.anInt6825 == this.anInt6825 && this.anInt6823 == arg0.anInt6823 && arg0.aClass40_3 == this.aClass40_3;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLclient!ig;)V")
	public void method5608(@OriginalArg(1) Class8_Sub8 arg0) {
		this.aFloat135 = (float) (arg0.method8525() * 8) / 255.0F;
		this.aFloat134 = (float) (arg0.method8525() * 8) / 255.0F;
		this.aFloat133 = (float) (arg0.method8525() * 8) / 255.0F;
	}
}
