import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class40 implements Interface19 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!dba;")
	protected final Class65 aClass65_4;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dba;)V")
	protected Class40(@OriginalArg(0) Class65 arg0) {
		this.aClass65_4 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method6771() {
		@Pc(24) int local24 = this.aClass65_4.aClass114_6.method2576(this.aClass65_4.anInt4919, Static168.anInt3084) + this.aClass65_4.anInt4922;
		@Pc(38) int local38 = this.aClass65_4.aClass72_6.method1433(Static112.anInt1892, this.aClass65_4.anInt4916) + this.aClass65_4.anInt4923;
		this.method6298(local38, local24);
		this.method6296(local24, local38);
		Static264.aClass82_3.method7873(this.aClass65_4.anInt4917, local38 + this.aClass65_4.anInt4916 / 2 + 4, Static546.aString86, local24 + this.aClass65_4.anInt4919 / 2, -1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZB)V")
	protected abstract void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZI)V")
	protected abstract void method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public abstract void method6770();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
	public abstract boolean method6772();
}
