import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class46 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	private int anInt957 = -1;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt961 = 0;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!wba;")
	private Class353 aClass353_9 = new Class353();

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private final int anInt960;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private final int anInt955;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!kn;")
	private Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt960 = arg0;
		this.anInt955 = arg1;
		this.anIntArrayArrayArray3 = new int[this.anInt960][3][arg2];
		this.aClass1_Sub29Array1 = new Class1_Sub29[this.anInt955];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)[[[I")
	public int[][][] method854() {
		if (this.anInt960 != this.anInt955) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt960; local29++) {
			this.aClass1_Sub29Array1[local29] = Static74.aClass1_Sub29_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method855() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt960; local11++) {
			this.anIntArrayArrayArray3[local11][0] = null;
			this.anIntArrayArrayArray3[local11][1] = null;
			this.anIntArrayArrayArray3[local11][2] = null;
			this.anIntArrayArrayArray3[local11] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass1_Sub29Array1 = null;
		this.aClass353_9.method7680();
		this.aClass353_9 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I")
	public int[][] method856(@OriginalArg(0) int arg0) {
		if (this.anInt955 == this.anInt960) {
			this.aBoolean76 = this.aClass1_Sub29Array1[arg0] == null;
			this.aClass1_Sub29Array1[arg0] = Static74.aClass1_Sub29_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt960 == 1) {
			this.aBoolean76 = arg0 != this.anInt957;
			this.anInt957 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(47) Class1_Sub29 local47 = this.aClass1_Sub29Array1[arg0];
			if (local47 == null) {
				this.aBoolean76 = true;
				if (this.anInt961 >= this.anInt960) {
					@Pc(68) Class1_Sub29 local68 = (Class1_Sub29) this.aClass353_9.method7676();
					local47 = new Class1_Sub29(arg0, local68.anInt4810);
					this.aClass1_Sub29Array1[local68.anInt4816] = null;
					local68.method7859();
				} else {
					local47 = new Class1_Sub29(arg0, this.anInt961);
					this.anInt961++;
				}
				this.aClass1_Sub29Array1[arg0] = local47;
			} else {
				this.aBoolean76 = false;
			}
			this.aClass353_9.method7684(local47);
			return this.anIntArrayArrayArray3[local47.anInt4810];
		}
	}
}
