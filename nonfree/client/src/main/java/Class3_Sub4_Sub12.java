import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
	private int anInt3148;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	private int anInt3149;

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
	private int anInt3150;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	private Class3_Sub4_Sub12(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2514(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub12() {
		this(0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static106.anInt2356; local29++) {
				local19[local29] = this.anInt3148;
				local23[local29] = this.anInt3149;
				local27[local29] = this.anInt3150;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.method2514(arg1.method6020());
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V")
	private void method2514(@OriginalArg(0) int arg0) {
		this.anInt3149 = arg0 >> 4 & 0xFF0;
		this.anInt3148 = arg0 >> 12 & 0xFF0;
		this.anInt3150 = (arg0 & 0xFF) << 4;
	}
}
