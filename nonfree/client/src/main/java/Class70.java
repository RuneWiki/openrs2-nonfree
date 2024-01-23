import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class70 {

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!g;")
	private Class2 aClass2_127;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!g;")
	private Class2 aClass2_128;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	private int anInt3220 = 0;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	private int anInt3214;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lclient!g;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class70(@OriginalArg(0) int arg0) {
		this.anInt3214 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_211 = local23;
			local23.aClass2_212 = local23;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!g;")
	public Class2 method2203() {
		this.anInt3220 = 0;
		return this.method2204();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!g;")
	public Class2 method2204() {
		@Pc(24) Class2 local24;
		if (this.anInt3220 > 0 && this.aClass2_128 != this.aClass2Array1[this.anInt3220 - 1]) {
			local24 = this.aClass2_128;
			this.aClass2_128 = local24.aClass2_212;
			return local24;
		}
		while (this.anInt3214 > this.anInt3220) {
			local24 = this.aClass2Array1[this.anInt3220++].aClass2_212;
			if (this.aClass2Array1[this.anInt3220 - 1] != local24) {
				this.aClass2_128 = local24.aClass2_212;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)Lclient!g;")
	public Class2 method2205(@OriginalArg(1) long arg0) {
		this.aLong96 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt3214 - 1))];
		for (this.aClass2_127 = local18.aClass2_212; this.aClass2_127 != local18; this.aClass2_127 = this.aClass2_127.aClass2_212) {
			if (arg0 == this.aClass2_127.aLong150) {
				@Pc(32) Class2 local32 = this.aClass2_127;
				this.aClass2_127 = this.aClass2_127.aClass2_212;
				return local32;
			}
		}
		this.aClass2_127 = null;
		return null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JLclient!g;I)V")
	public void method2208(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_211 != null) {
			arg1.method3314();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt3214 - 1))];
		arg1.aLong150 = arg0;
		arg1.aClass2_211 = local21.aClass2_211;
		arg1.aClass2_212 = local21;
		arg1.aClass2_211.aClass2_212 = arg1;
		arg1.aClass2_212.aClass2_211 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lclient!g;")
	public Class2 method2210() {
		if (this.aClass2_127 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong96 & (long) (this.anInt3214 - 1))];
		while (this.aClass2_127 != local21) {
			if (this.aLong96 == this.aClass2_127.aLong150) {
				@Pc(39) Class2 local39 = this.aClass2_127;
				this.aClass2_127 = this.aClass2_127.aClass2_212;
				return local39;
			}
			this.aClass2_127 = this.aClass2_127.aClass2_212;
		}
		this.aClass2_127 = null;
		return null;
	}
}
