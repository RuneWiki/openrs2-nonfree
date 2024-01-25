import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class60_Sub1 extends Class60 implements Interface22 {

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "B")
	private byte aByte37;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!hj;Z)V")
	public Class60_Sub1(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method1387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte37 = (byte) arg0;
		super.method7563(arg1);
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZLclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte37 = (byte) arg1;
		super.method7566(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	@Override
	public void method7572() {
		super.method7572();
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)I")
	public int method1392() {
		return this.aByte37;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1390() {
		return super.method7567(super.aClass82_Sub3_Sub1_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)I")
	@Override
	public int method7561() {
		return super.method7561();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method1389() {
		return super.method7562(super.aClass82_Sub3_Sub1_9.aMapBuffer2);
	}
}
