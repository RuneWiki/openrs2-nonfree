import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class93 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!fi;")
	public Class93 aClass93_1;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!m;")
	public Class118 aClass118_4;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
	public final int anInt2654;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public final int anInt2653;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(II)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2654 = arg1;
		this.anInt2653 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fi;I)V")
	public Class93(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		this.aClass93_1 = arg0;
		this.anInt2654 = this.aClass93_1.anInt2654 + arg1;
		this.aClass118_4 = this.aClass93_1.aClass118_4;
		this.anInt2653 = this.aClass93_1.anInt2653;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lclient!bb;")
	public Class19 method2254() {
		return Static171.method2593(this.anInt2653);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Lclient!fi;")
	public Class93 method2257(@OriginalArg(1) int arg0) {
		return new Class93(this.anInt2653, arg0);
	}
}
