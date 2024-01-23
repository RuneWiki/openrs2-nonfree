import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class102 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!dh;")
	private Class1 aClass1_163;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!dh;")
	private Class1 aClass1_164;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	private int anInt3990 = 0;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private int anInt3978;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[Lclient!dh;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this.anInt3978 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_202 = local23;
			local23.aClass1_201 = local23;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!dh;BJ)V")
	public void method3083(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_201 != null) {
			arg0.method3758();
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt3978 - 1))];
		arg0.aClass1_202 = local28;
		arg0.aLong170 = arg1;
		arg0.aClass1_201 = local28.aClass1_201;
		arg0.aClass1_201.aClass1_202 = arg0;
		arg0.aClass1_202.aClass1_201 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lclient!dh;")
	public Class1 method3086() {
		this.anInt3990 = 0;
		return this.method3087();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lclient!dh;")
	public Class1 method3087() {
		@Pc(19) Class1 local19;
		if (this.anInt3990 > 0 && this.aClass1_164 != this.aClass1Array1[this.anInt3990 - 1]) {
			local19 = this.aClass1_164;
			this.aClass1_164 = local19.aClass1_202;
			return local19;
		}
		while (this.anInt3978 > this.anInt3990) {
			local19 = this.aClass1Array1[this.anInt3990++].aClass1_202;
			if (local19 != this.aClass1Array1[this.anInt3990 - 1]) {
				this.aClass1_164 = local19.aClass1_202;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lclient!dh;")
	public Class1 method3089() {
		if (this.aClass1_163 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt3978 - 1) & this.aLong136)];
		while (local21 != this.aClass1_163) {
			if (this.aLong136 == this.aClass1_163.aLong170) {
				@Pc(36) Class1 local36 = this.aClass1_163;
				this.aClass1_163 = this.aClass1_163.aClass1_202;
				return local36;
			}
			this.aClass1_163 = this.aClass1_163.aClass1_202;
		}
		this.aClass1_163 = null;
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public void method3090() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3978; local12++) {
			@Pc(19) Class1 local19 = this.aClass1Array1[local12];
			while (true) {
				@Pc(22) Class1 local22 = local19.aClass1_202;
				if (local22 == local19) {
					break;
				}
				local22.method3758();
			}
		}
		this.aClass1_163 = null;
		this.aClass1_164 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)Lclient!dh;")
	public Class1 method3093(@OriginalArg(1) long arg0) {
		this.aLong136 = arg0;
		@Pc(19) Class1 local19 = this.aClass1Array1[(int) ((long) (this.anInt3978 - 1) & arg0)];
		for (this.aClass1_163 = local19.aClass1_202; this.aClass1_163 != local19; this.aClass1_163 = this.aClass1_163.aClass1_202) {
			if (this.aClass1_163.aLong170 == arg0) {
				@Pc(37) Class1 local37 = this.aClass1_163;
				this.aClass1_163 = this.aClass1_163.aClass1_202;
				return local37;
			}
		}
		this.aClass1_163 = null;
		return null;
	}
}
