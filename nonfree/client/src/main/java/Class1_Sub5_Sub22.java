import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class1_Sub5_Sub22 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	public int anInt5191;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
	public int anInt5192;

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
	public int anInt5193;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
	public int anInt5195;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
	public int anInt5200;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
	public int anInt5201;

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
	public int anInt5202;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
	public int anInt5203;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!hk;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!hk;Lclient!dh;)V")
	public Class1_Sub5_Sub22(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class22_Sub3 arg1) {
		this.aClass76_1 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZI)V")
	public void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt5191 = arg2;
		this.anInt5193 = arg0;
		this.anInt5201 = arg1;
	}
}
