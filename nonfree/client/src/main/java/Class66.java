import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class66 implements Interface25 {

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public final int anInt2870;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public final int anInt2867;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	public final int anInt2876;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public final int anInt2866;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	public final int anInt2874;

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
	public final int anInt2879;

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "Lclient!haa;")
	public final Class127 aClass127_5;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public final int anInt2878;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public final int anInt2868;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Lclient!ee;")
	public final Class79 aClass79_4;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
	public final boolean aBoolean235;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILclient!ee;Lclient!haa;IIIIIIIZ)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2870 = arg7;
		this.anInt2867 = arg4;
		this.anInt2876 = arg6;
		this.anInt2866 = arg9;
		this.anInt2874 = arg5;
		this.anInt2879 = arg0;
		this.aClass127_5 = arg2;
		this.anInt2878 = arg3;
		this.anInt2868 = arg8;
		this.aClass79_4 = arg1;
		this.aBoolean235 = arg10;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static622.aClass129_10;
	}
}
