import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class214 {

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "F")
	public float aFloat77 = 0.25F;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "F")
	public float aFloat80 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "F")
	public float aFloat76 = 1.0F;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public final int anInt6694;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "F")
	public final float aFloat81;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!qe;")
	public final Class132 aClass132_4;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public final int anInt6697;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
	public final int anInt6702;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
	public final int anInt6700;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	public final int anInt6691;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public final int anInt6692;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "F")
	public final float aFloat78;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class214() {
		this.aFloat79 = 0.69921875F;
		this.anInt6694 = -50;
		this.aFloat81 = 1.1523438F;
		this.aClass132_4 = Static87.aClass132_1;
		this.anInt6697 = -50;
		this.anInt6702 = -60;
		this.anInt6700 = Static136.anInt6461;
		this.anInt6691 = 0;
		this.anInt6692 = Static339.anInt6543;
		this.aFloat78 = 1.2F;
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class214(@OriginalArg(0) Class11_Sub25 arg0) {
		@Pc(16) int local16 = arg0.method5185();
		if (Static52.aBoolean313 && Static85.aClass129_2.method5000() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6700 = Static136.anInt6461;
			} else {
				this.anInt6700 = arg0.method5198();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat81 = 1.1523438F;
			} else {
				this.aFloat81 = (float) arg0.method5187() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat79 = 0.69921875F;
			} else {
				this.aFloat79 = (float) arg0.method5187() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat78 = 1.2F;
			} else {
				this.aFloat78 = (float) arg0.method5187() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5198();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5187();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5187();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5187();
			}
			this.anInt6700 = Static136.anInt6461;
			this.aFloat78 = 1.2F;
			this.aFloat81 = 1.1523438F;
			this.aFloat79 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6694 = -50;
			this.anInt6702 = -60;
			this.anInt6697 = -50;
		} else {
			this.anInt6697 = arg0.method5220();
			this.anInt6702 = arg0.method5220();
			this.anInt6694 = arg0.method5220();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6692 = Static339.anInt6543;
		} else {
			this.anInt6692 = arg0.method5198();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6691 = 0;
		} else {
			this.anInt6691 = arg0.method5187();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass132_4 = Static87.aClass132_1;
		} else {
			this.aClass132_4 = Static313.method5271(arg0.method5187(), arg0.method5187(), arg0.method5187(), arg0.method5187(), arg0.method5187(), arg0.method5187());
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!kh;)V")
	public void method5662(@OriginalArg(1) Class11_Sub25 arg0) {
		this.aFloat80 = (float) (arg0.method5185() * 8) / 255.0F;
		this.aFloat77 = (float) (arg0.method5185() * 8) / 255.0F;
		this.aFloat76 = (float) (arg0.method5185() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!wk;I)Z")
	public boolean method5665(@OriginalArg(0) Class214 arg0) {
		return this.anInt6700 == arg0.anInt6700 && this.aFloat81 == arg0.aFloat81 && this.aFloat79 == arg0.aFloat79 && arg0.aFloat78 == this.aFloat78 && this.aFloat77 == arg0.aFloat77 && this.aFloat80 == arg0.aFloat80 && this.aFloat76 == arg0.aFloat76 && arg0.anInt6692 == this.anInt6692 && this.anInt6691 == arg0.anInt6691 && this.aClass132_4 == arg0.aClass132_4;
	}
}
