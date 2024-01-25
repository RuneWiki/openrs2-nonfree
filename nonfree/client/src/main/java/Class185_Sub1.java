import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class185_Sub1 extends Class185 implements Interface11 {

	@OriginalMember(owner = "client!nea", name = "E", descriptor = "[I")
	public static final int[] anIntArray417 = new int[4096];

	@OriginalMember(owner = "client!nea", name = "u", descriptor = "B")
	private byte aByte101;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray417[local4] = Static621.method8618(local4);
		}
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!mba;Z)V")
	public Class185_Sub1(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	@Override
	public void method7982() {
		super.method7982();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6375() {
		return super.method7651(super.aClass5_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "(I)I")
	public int method6018() {
		return this.aByte101;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte101 = (byte) arg0;
		super.method7981(arg1);
		return true;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method6376(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte101 = (byte) arg2;
		super.method7645(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6374() {
		return super.method7644(super.aClass5_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
	@Override
	public int method7980() {
		return super.method7980();
	}
}
