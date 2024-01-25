import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public class Class52 implements Interface4 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "Lclient!ac;")
	protected Class5 aClass5_5;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "Lclient!gn;")
	protected final Class102 aClass102_2;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!kha;")
	private final Class181 aClass181_13;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!kha;Lclient!gn;)V")
	public Class52(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass102_2 = arg1;
		this.aClass181_13 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	@Override
	public final void method8346() {
		this.aClass5_5 = Static336.method3828(this.aClass181_13, this.aClass102_2.anInt3823);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		@Pc(26) int local26 = this.aClass102_2.aClass117_6.method3782(Static199.anInt4634, this.aClass5_5.method7589()) + this.aClass102_2.anInt3827;
		@Pc(40) int local40 = this.aClass102_2.aClass178_6.method5000(this.aClass5_5.method7585(), Static523.anInt9075) + this.aClass102_2.anInt3822;
		this.aClass5_5.method7577(local26, local40);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8344() {
		return this.aClass181_13.method5040(this.aClass102_2.anInt3823);
	}
}
