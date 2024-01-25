import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
	private final int anInt1806;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	private final int anInt1810;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
	private final int anInt1805;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
	private final int anInt1803;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub5(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt1806 = arg0.method8575();
		this.anInt1810 = arg0.method8575();
		this.aString12 = arg0.method8553();
		this.anInt1805 = arg0.method8555(-9372);
		this.anInt1803 = arg0.method8575();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static513.method7265(this.anInt1803, this.aString12, Static684.anInt10516, this.anInt1810, Static324.method4554(Static684.anInt10516, this.anInt1806, this.anInt1810), this.anInt1805, this.anInt1806);
	}
}
