import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class2_Sub8_Sub15 extends Class2_Sub8 {

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
	public int anInt4045;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
	public int anInt4047;

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
	public int anInt4050;

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "Lclient!ue;")
	public Class176 aClass176_1;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ue;Lclient!gl;)V")
	public Class2_Sub8_Sub15(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class20_Sub2 arg1) {
		this.aClass176_1 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	public void method3311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4045 = arg0;
		this.anInt4044 = arg2;
		this.anInt4047 = arg1;
	}
}
