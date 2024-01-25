import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class6_Sub5_Sub7 extends Class6_Sub5 {

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
	public int anInt2814;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!cia;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Lclient!ega;")
	public final Class81 aClass81_1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!cia;Lclient!lba;)V")
	public Class6_Sub5_Sub7(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class9_Sub5 arg1) {
		this.aClass49_2 = arg0;
		this.aClass81_1 = this.aClass49_2.method2062();
		this.method2381();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public void method2381() {
		this.anInt2809 = this.aClass49_2.anInt2381;
		this.anInt2816 = this.aClass49_2.anInt2388;
		this.anInt2808 = this.aClass49_2.anInt2384;
		if (this.aClass49_2.aClass115_1 != null) {
			this.aClass49_2.aClass115_1.method6289(this.aClass81_1.anInt3150, this.aClass81_1.anInt3155, this.aClass81_1.anInt3149, Static377.anIntArray340);
		}
		this.anInt2814 = Static377.anIntArray340[2];
		this.anInt2810 = Static377.anIntArray340[0];
	}
}
