import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public int anInt7295;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	public int anInt7296;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	public int anInt7297;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public int anInt7298;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public int anInt7300;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "Lclient!fi;")
	public final Class93 aClass93_2;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!bb;")
	public final Class19 aClass19_1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!fi;Lclient!lm;)V")
	public Class1_Sub1_Sub17(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class72_Sub4 arg1) {
		this.aClass93_2 = arg0;
		this.aClass19_1 = this.aClass93_2.method2254();
		this.method6106();
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method6106() {
		this.anInt7296 = this.aClass93_2.anInt2651;
		this.anInt7297 = this.aClass93_2.anInt2652;
		this.anInt7298 = this.aClass93_2.anInt2655;
		if (this.aClass93_2.aClass118_4 != null) {
			this.aClass93_2.aClass118_4.I(this.aClass19_1.anInt735, this.aClass19_1.anInt729, this.aClass19_1.anInt723, Static164.anIntArray284);
		}
		this.anInt7300 = Static164.anIntArray284[2];
		this.anInt7295 = Static164.anIntArray284[0];
	}
}
