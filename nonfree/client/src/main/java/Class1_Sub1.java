import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!mfa;")
	protected Class223 aClass223_41;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	public int anInt9443;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!cc;")
	protected Class46 aClass46_41;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lclient!ap;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean737 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)V")
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt9443 == 255 ? arg1 : this.anInt9443;
		if (this.aBoolean737) {
			this.aClass223_41 = new Class223(local17, arg1, arg0);
		} else {
			this.aClass46_41 = new Class46(local17, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public void method7699() {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub1Array42[arg1].aBoolean737) {
			@Pc(22) int[] local22 = this.aClass1_Sub1Array42[arg1].method7706(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass1_Sub1Array42[arg1].method7705(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
	public int method7703() {
		return -1;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)I")
	public int method7704() {
		return -1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[[I")
	public int[][] method7705(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)[I")
	public int[] method7706(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!mo;I)V")
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)[I")
	protected final int[] method7709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean737 ? this.aClass1_Sub1Array42[arg1].method7706(arg0) : this.aClass1_Sub1Array42[arg1].method7705(arg0)[0];
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V")
	public void method7710() {
		if (this.aBoolean737) {
			this.aClass223_41.method4436();
			this.aClass223_41 = null;
		} else {
			this.aClass46_41.method855();
			this.aClass46_41 = null;
		}
	}
}
