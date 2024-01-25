import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class6_Sub1_Sub16 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	public int anInt6054;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public int anInt6056;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
	public int anInt6059;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "Lclient!ma;")
	public final Class161 aClass161_2;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!mj;")
	public final Class168 aClass168_1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ma;Lclient!dd;)V")
	public Class6_Sub1_Sub16(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class48_Sub1 arg1) {
		this.aClass161_2 = arg0;
		this.aClass168_1 = this.aClass161_2.method3710();
		this.method5071();
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public void method5071() {
		this.anInt6053 = this.aClass161_2.anInt4061;
		this.anInt6056 = this.aClass161_2.anInt4063;
		this.anInt6051 = this.aClass161_2.anInt4060;
		if (this.aClass161_2.aClass132_2 != null) {
			this.aClass161_2.aClass132_2.method3984(this.aClass168_1.anInt4162, this.aClass168_1.anInt4161, this.aClass168_1.anInt4147, Static442.anIntArray543);
		}
		this.anInt6059 = Static442.anIntArray543[2];
		this.anInt6054 = Static442.anIntArray543[0];
	}
}
