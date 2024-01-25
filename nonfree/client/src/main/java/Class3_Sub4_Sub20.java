import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class3_Sub4_Sub20 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
	public int anInt9423;

	@OriginalMember(owner = "client!sba", name = "A", descriptor = "I")
	public int anInt9424;

	@OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
	public int anInt9426;

	@OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
	public int anInt9427;

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "I")
	public int anInt9428;

	@OriginalMember(owner = "client!sba", name = "x", descriptor = "Lclient!sw;")
	public final Class348 aClass348_1;

	@OriginalMember(owner = "client!sba", name = "v", descriptor = "Lclient!jj;")
	public final Class187 aClass187_1;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!sw;Lclient!oi;)V")
	public Class3_Sub4_Sub20(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class19_Sub9 arg1) {
		this.aClass348_1 = arg0;
		this.aClass187_1 = this.aClass348_1.method8245();
		this.method7940();
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)V")
	public void method7940() {
		this.anInt9423 = this.aClass348_1.anInt9768;
		this.anInt9427 = this.aClass348_1.anInt9763;
		this.anInt9426 = this.aClass348_1.anInt9765;
		if (this.aClass348_1.aClass181_13 != null) {
			this.aClass348_1.aClass181_13.method6346(this.aClass187_1.anInt5478, this.aClass187_1.anInt5473, this.aClass187_1.anInt5481, Static345.anIntArray339);
		}
		this.anInt9424 = Static345.anIntArray339[2];
		this.anInt9428 = Static345.anIntArray339[0];
	}
}
