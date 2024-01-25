import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class3_Sub9_Sub32 extends Class3_Sub9 {

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
	private int anInt8690;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
	private int anInt8691;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
	private int anInt8693;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	private Class3_Sub9_Sub32(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7607(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub32() {
		this(0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static62.anInt1251; local34++) {
				local24[local34] = this.anInt8691;
				local28[local34] = this.anInt8693;
				local32[local34] = this.anInt8690;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method7607(arg0.method8607());
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	private void method7607(@OriginalArg(1) int arg0) {
		this.anInt8693 = arg0 >> 4 & 0xFF0;
		this.anInt8691 = arg0 >> 12 & 0xFF0;
		this.anInt8690 = (arg0 & 0xFF) << 4;
	}
}
