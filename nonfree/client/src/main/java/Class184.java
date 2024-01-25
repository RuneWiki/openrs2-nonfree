import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class184 {

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!jv;")
	private final Class126 aClass126_42 = new Class126(16);

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Lclient!bu;")
	private final Class32 aClass32_68;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class184(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_68 = arg2;
		this.aClass32_68.method790(29);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public void method4141() {
		@Pc(14) Class126 local14 = this.aClass126_42;
		synchronized (this.aClass126_42) {
			this.aClass126_42.method3131();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIILclient!rb;)Lclient!ib;")
	public Class108 method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class212 arg4) {
		@Pc(12) Class144[] local12 = null;
		@Pc(17) Class66 local17 = this.method4148(arg1);
		if (local17.anIntArray130 != null) {
			local12 = new Class144[local17.anIntArray130.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(36) Class229 local36 = arg4.method4536(local17.anIntArray130[local27]);
				local12[local27] = new Class144(local36.anInt6260, local36.anInt6253, local36.anInt6259, local36.anInt6261, local36.anInt6258, local36.anInt6254, local36.anInt6255, local36.aBoolean541);
			}
		}
		return new Class108(local17.anInt2186, local12, local17.anInt2189, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	public void method4144() {
		@Pc(13) Class126 local13 = this.aClass126_42;
		synchronized (this.aClass126_42) {
			this.aClass126_42.method3140(5);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method4146() {
		@Pc(2) Class126 local2 = this.aClass126_42;
		synchronized (this.aClass126_42) {
			this.aClass126_42.method3135();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)Lclient!eo;")
	private Class66 method4148(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_42;
		@Pc(16) Class66 local16;
		synchronized (this.aClass126_42) {
			local16 = (Class66) this.aClass126_42.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass32_68.method785(arg0, 29);
		local16 = new Class66();
		if (local41 != null) {
			local16.method1696(new Class3_Sub7(local41));
		}
		@Pc(57) Class126 local57 = this.aClass126_42;
		synchronized (this.aClass126_42) {
			this.aClass126_42.method3132((long) arg0, local16);
			return local16;
		}
	}
}
