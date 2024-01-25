import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class76 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!ee;")
	private Class52 aClass52_1 = null;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	private int anInt2584 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	private int anInt2585 = 0;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_14;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!fg;")
	private final Class67 aClass67_2;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[Lclient!wc;")
	private final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class76(@OriginalArg(0) Class47_Sub2 arg0) {
		this.aClass47_Sub2_14 = arg0;
		this.aClass67_2 = new Class67(arg0);
		this.aClass11Array1 = new Class11[9];
		this.aClass11Array1[1] = new Class11_Sub7(arg0);
		this.aClass11Array1[2] = new Class11_Sub1(arg0, this.aClass67_2);
		this.aClass11Array1[4] = new Class11_Sub6(arg0, this.aClass67_2);
		this.aClass11Array1[5] = new Class11_Sub3(arg0, this.aClass67_2);
		this.aClass11Array1[6] = new Class11_Sub4(arg0);
		this.aClass11Array1[7] = new Class11_Sub2(arg0);
		this.aClass11Array1[3] = new Class11_Sub5(arg0);
		this.aClass11Array1[8] = this.aClass11Array1[4];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZI)V")
	public void method2281(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) boolean local13 = arg1 & this.aClass47_Sub2_14.method2672();
		if (!local13 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt2585) {
			if (this.anInt2585 != 0) {
				this.aClass11Array1[Integer.MAX_VALUE & this.anInt2585].method4751();
			}
			if (arg2 != 0) {
				this.aClass11Array1[Integer.MAX_VALUE & arg2].method4749(arg0);
				this.aClass11Array1[Integer.MAX_VALUE & arg2].method4748(arg0);
			}
			this.aClass52_1 = null;
			this.anInt2584 = Integer.MIN_VALUE;
			this.anInt2585 = arg2;
		} else if (this.anInt2585 != 0) {
			this.aClass11Array1[this.anInt2585 & Integer.MAX_VALUE].method4748(arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Z")
	public boolean method2282() {
		return this.aClass11Array1[3].method4747();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZ)V")
	public void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if ((arg1 | arg0 != this.anInt2584) & this.anInt2585 != 0) {
			this.aClass11Array1[Integer.MAX_VALUE & this.anInt2585].method4750(arg0);
			this.anInt2584 = arg0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!ee;)Z")
	public boolean method2284(@OriginalArg(1) Class52 arg0) {
		if (this.anInt2585 == 0) {
			return false;
		}
		if (this.aClass52_1 != arg0) {
			this.aClass11Array1[this.anInt2585 & Integer.MAX_VALUE].method4746(arg0);
			this.aClass52_1 = arg0;
		}
		return true;
	}
}
