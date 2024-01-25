import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class Class8_Sub32 extends Class8 {

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!nv;")
	protected final Class16_Sub3 aClass16_Sub3_25;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class8_Sub32(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_25 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
	public abstract void method4947(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V")
	public abstract void method4948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public abstract void method4950();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!wn;IILclient!wn;)V")
	public abstract void method4951(@OriginalArg(0) Class20_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20_Sub4 arg2);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
	public final boolean method4952() {
		return false;
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)Z")
	public final boolean method4953() {
		return this.aBoolean432;
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)Z")
	public abstract boolean method4954();

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "(I)Z")
	public abstract boolean method4956();

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I")
	public final int method4958() {
		return 1;
	}

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "(I)I")
	public int method4959() {
		return 0;
	}
}
