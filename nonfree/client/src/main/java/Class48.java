import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class48 {

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "Lclient!rv;")
	private Class3_Sub7 aClass3_Sub7_11;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	private final int anInt1494;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "[Lclient!rv;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class48(@OriginalArg(0) int arg0) {
		this.anInt1494 = arg0;
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_67 = local20;
			local20.aClass3_Sub7_66 = local20;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!rv;JZ)V")
	public void method1406(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_Sub7_66 != null) {
			arg0.method9251();
		}
		@Pc(31) Class3_Sub7 local31 = this.aClass3_Sub7Array1[(int) (arg1 & (long) (this.anInt1494 - 1))];
		arg0.aClass3_Sub7_66 = local31.aClass3_Sub7_66;
		arg0.aClass3_Sub7_67 = local31;
		arg0.aClass3_Sub7_66.aClass3_Sub7_67 = arg0;
		arg0.aLong336 = arg1;
		arg0.aClass3_Sub7_67.aClass3_Sub7_66 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(JB)Lclient!rv;")
	public Class3_Sub7 method1409(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
		@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[(int) (arg0 & (long) (this.anInt1494 - 1))];
		for (this.aClass3_Sub7_11 = local20.aClass3_Sub7_67; this.aClass3_Sub7_11 != local20; this.aClass3_Sub7_11 = this.aClass3_Sub7_11.aClass3_Sub7_67) {
			if (arg0 == this.aClass3_Sub7_11.aLong336) {
				@Pc(49) Class3_Sub7 local49 = this.aClass3_Sub7_11;
				this.aClass3_Sub7_11 = this.aClass3_Sub7_11.aClass3_Sub7_67;
				return local49;
			}
		}
		this.aClass3_Sub7_11 = null;
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lclient!rv;")
	public Class3_Sub7 method1410() {
		if (this.aClass3_Sub7_11 == null) {
			return null;
		}
		@Pc(32) Class3_Sub7 local32 = this.aClass3_Sub7Array1[(int) (this.aLong48 & (long) (this.anInt1494 - 1))];
		while (local32 != this.aClass3_Sub7_11) {
			if (this.aClass3_Sub7_11.aLong336 == this.aLong48) {
				@Pc(50) Class3_Sub7 local50 = this.aClass3_Sub7_11;
				this.aClass3_Sub7_11 = this.aClass3_Sub7_11.aClass3_Sub7_67;
				return local50;
			}
			this.aClass3_Sub7_11 = this.aClass3_Sub7_11.aClass3_Sub7_67;
		}
		this.aClass3_Sub7_11 = null;
		return null;
	}
}
