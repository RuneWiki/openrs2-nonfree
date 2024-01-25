import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	private int anInt3356;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	private int anInt3361;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	private int anInt3362;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3096(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.method3096(arg1.method2119());
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	private void method3096(@OriginalArg(1) int arg0) {
		this.anInt3361 = arg0 >> 12 & 0xFF0;
		this.anInt3362 = (arg0 & 0xFF) << 4;
		this.anInt3356 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static85.anInt1910; local29++) {
				local19[local29] = this.anInt3361;
				local23[local29] = this.anInt3356;
				local27[local29] = this.anInt3362;
			}
		}
		return local11;
	}
}
