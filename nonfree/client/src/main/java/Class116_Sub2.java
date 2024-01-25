import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class116_Sub2 extends Class116 implements Interface15 {

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "B")
	private byte aByte89;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!tia;Z)V")
	public Class116_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7346() {
		return super.method7346();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5734() {
		return super.method5726(super.aClass100_Sub1_Sub2_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte89 = (byte) arg1;
		super.method7350(arg0);
		return true;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)I")
	public int method5736() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7351() {
		super.method7351();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method5732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte89 = (byte) arg0;
		super.method5723(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5735() {
		return super.method5727(super.aClass100_Sub1_Sub2_7.aMapBuffer2);
	}
}
