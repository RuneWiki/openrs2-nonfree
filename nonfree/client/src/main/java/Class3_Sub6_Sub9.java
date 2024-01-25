import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class3_Sub6_Sub9 extends Class3_Sub6 {

	@OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
	public Class3_Sub6_Sub9(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3543 = 4096;
		this.anInt3543 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub9() {
		this(4096);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			Static604.method6221(local16, 0, Static481.anInt8358, this.anInt3543);
		}
		return local16;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3543 = (arg0.method6814() << 12) / 255;
		}
	}
}
