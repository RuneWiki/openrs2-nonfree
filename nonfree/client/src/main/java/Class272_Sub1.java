import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class272_Sub1 extends Class272 implements Interface3 {

	@OriginalMember(owner = "client!sba", name = "G", descriptor = "B")
	private byte aByte110;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!eea;Z)V")
	public Class272_Sub1(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I")
	@Override
	public int method7668() {
		return super.method7668();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7189() {
		return super.method7678(super.aClass87_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I")
	public int method7190() {
		return this.aByte110;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return super.method7672(super.aClass87_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method7188(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte110 = (byte) arg1;
		super.method7670(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7671() {
		super.method7671();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte110 = (byte) arg0;
		super.method7675(arg1);
		return true;
	}
}
