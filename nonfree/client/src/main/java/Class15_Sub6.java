import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	private final int anInt2066;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub6(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt2066 = arg0.method8575();
		this.anInt2069 = arg0.method8552();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(15) Class398 local15 = Static486.aClass398Array1[this.anInt2066];
		Static162.method2426(local15.anInt10832, this.anInt2069, local15.anInt10834, local15.anInt10838, local15.anInt10839, local15.anInt10831, Static269.anIntArray307[local15.anInt10838]);
	}
}
