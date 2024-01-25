import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
	public boolean aBoolean449;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!hk;")
	protected final Class16_Sub2 aClass16_Sub2_31;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class3_Sub31(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_31 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z")
	public final boolean method4772() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public abstract void method4773();

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Z")
	public abstract boolean method4775();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public abstract void method4777(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
	public abstract boolean method4778();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIB)V")
	public abstract void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)I")
	public int method4780() {
		return 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!kf;IILclient!kf;)V")
	public abstract void method4781(@OriginalArg(0) Class39_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39_Sub4 arg2);

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)Z")
	public final boolean method4782() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "(I)I")
	public final int method4783() {
		return 1;
	}
}
