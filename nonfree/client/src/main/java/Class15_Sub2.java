import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class15_Sub2 extends Class15 implements Interface12 {

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "[Lclient!hv;")
	public static final Class107[] aClass107Array1 = new Class107[5];

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	private int anInt636;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass107Array1.length; local4++) {
			aClass107Array1[local4] = new Class107();
		}
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!tt;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class15_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt636 = arg1;
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!tt;I[BI)V")
	public Class15_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt636 = arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
	@Override
	public int method5509() {
		return this.anInt636;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method535(arg2, arg0);
		this.anInt636 = arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)I")
	@Override
	public int method5510() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)J")
	@Override
	public long method5508() {
		return super.aNativeBuffer3.b();
	}
}
