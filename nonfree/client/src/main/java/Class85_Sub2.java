import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class85_Sub2 extends Class85 implements Interface8 {

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "B")
	private byte aByte84;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kd;Z)V")
	public Class85_Sub2(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I")
	@Override
	public int method7030() {
		return super.method7030();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5366(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte84 = (byte) arg0;
		super.method5364(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5369() {
		return super.method5362(super.aClass162_Sub1_Sub2_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte84 = (byte) arg1;
		super.method7035(arg0);
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5368() {
		return super.method5356(super.aClass162_Sub1_Sub2_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method7032() {
		super.method7032();
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	public int method5372() {
		return this.aByte84;
	}
}
