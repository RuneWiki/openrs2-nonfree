import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	public int anInt229;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "Lclient!oo;")
	public final Class255 aClass255_1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!sc;")
	public final Class312 aClass312_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!oo;Lclient!pba;)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class13_Sub9 arg1) {
		this.aClass255_1 = arg0;
		this.aClass312_1 = this.aClass255_1.method5515();
		this.method241();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public void method241() {
		this.anInt223 = this.aClass255_1.anInt6392;
		this.anInt226 = this.aClass255_1.anInt6389;
		this.anInt228 = this.aClass255_1.anInt6390;
		if (this.aClass255_1.aClass177_8 != null) {
			this.aClass255_1.aClass177_8.method7867(this.aClass312_1.anInt8514, this.aClass312_1.anInt8530, this.aClass312_1.anInt8518, Static162.anIntArray195);
		}
		this.anInt224 = Static162.anIntArray195[0];
		this.anInt229 = Static162.anIntArray195[2];
	}
}
