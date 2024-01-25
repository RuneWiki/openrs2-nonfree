import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!ic;")
	protected Class152 aClass152_41;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public int anInt9640;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Lclient!no;")
	protected Class241 aClass241_41;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "[Lclient!rk;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Z")
	public boolean aBoolean711;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean711 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
	public int[] method7826(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
	public int method7827() {
		return -1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
	public int method7828() {
		return -1;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public void method7829() {
		if (this.aBoolean711) {
			this.aClass152_41.method3213();
			this.aClass152_41 = null;
		} else {
			this.aClass241_41.method5272();
			this.aClass241_41 = null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	public void method7831() {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[[I")
	public int[][] method7832(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean711) {
			@Pc(30) int[] local30 = this.aClass1_Sub1Array42[arg0].method7826(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method7832(arg1);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V")
	public void method7834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9640 == 255 ? arg0 : this.anInt9640;
		if (this.aBoolean711) {
			this.aClass152_41 = new Class152(local12, arg0, arg1);
		} else {
			this.aClass241_41 = new Class241(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILclient!ac;)V")
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean711 ? this.aClass1_Sub1Array42[arg1].method7826(arg0) : this.aClass1_Sub1Array42[arg1].method7832(arg0)[0];
	}
}
