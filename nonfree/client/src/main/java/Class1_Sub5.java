import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!wo;")
	public Class1_Sub6 aClass1_Sub6_5;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	public int anInt5599;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "Lclient!ei;")
	public Class1_Sub5 aClass1_Sub5_8;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "Z")
	public volatile boolean aBoolean451 = true;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
	public abstract int method4441();

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!ei;")
	public abstract Class1_Sub5 method4442();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
	protected final void method4443(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean451) {
			this.method4446(arg0, arg1, arg2);
		} else {
			this.method4445(arg2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()I")
	public int method4444() {
		return 255;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	public abstract void method4445(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "([III)V")
	public abstract void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lclient!ei;")
	public abstract Class1_Sub5 method4447();
}
