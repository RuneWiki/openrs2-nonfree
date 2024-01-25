import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class191 {

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!vg;")
	private final Class342 aClass342_122 = new Class342(64);

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!ri;")
	private final Class284 aClass284_97;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public final int anInt5762;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class191(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_97 = arg2;
		this.anInt5762 = this.aClass284_97.method6354(19);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lclient!ir;")
	public Class150 method4672(@OriginalArg(0) int arg0) {
		@Pc(13) Class342 local13 = this.aClass342_122;
		@Pc(23) Class150 local23;
		synchronized (this.aClass342_122) {
			local23 = (Class150) this.aClass342_122.method7684((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class284 local36 = this.aClass284_97;
		@Pc(47) byte[] local47;
		synchronized (this.aClass284_97) {
			local47 = this.aClass284_97.method6331(19, arg0);
		}
		local23 = new Class150();
		if (local47 != null) {
			local23.method3763(new Class3_Sub26(local47));
		}
		@Pc(69) Class342 local69 = this.aClass342_122;
		synchronized (this.aClass342_122) {
			this.aClass342_122.method7683(local23, (long) arg0);
			return local23;
		}
	}
}
