import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class15_Sub23 extends Class15 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	private final int anInt10733;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private final int anInt10727;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private final int anInt10732;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	private final int anInt10729;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub23(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt10733 = arg0.method8575();
		this.anInt10727 = arg0.method8581(-17416);
		this.anInt10732 = arg0.method8581(-17416);
		this.anInt10729 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static43.method587(this.anInt10733, this.anInt10727, false, this.anInt10729, this.anInt10732, 0);
	}
}
