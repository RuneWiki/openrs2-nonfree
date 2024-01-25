import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class171 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Lclient!vg;")
	private final Class342 aClass342_102 = new Class342(64);

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
	public int anInt5200 = 0;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!ri;")
	private final Class284 aClass284_82;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
	public final int anInt5199;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class171(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_82 = arg2;
		this.anInt5199 = this.aClass284_82.method6354(4);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public void method4159() {
		@Pc(6) Class342 local6 = this.aClass342_102;
		synchronized (this.aClass342_102) {
			this.aClass342_102.method7693();
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)V")
	public void method4160() {
		@Pc(2) Class342 local2 = this.aClass342_102;
		synchronized (this.aClass342_102) {
			this.aClass342_102.method7697(5);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lclient!ega;")
	public Class88 method4161(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_102;
		@Pc(16) Class88 local16;
		synchronized (this.aClass342_102) {
			local16 = (Class88) this.aClass342_102.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class284 local34 = this.aClass284_82;
		@Pc(43) byte[] local43;
		synchronized (this.aClass284_82) {
			local43 = this.aClass284_82.method6331(4, arg0);
		}
		local16 = new Class88();
		local16.aClass171_4 = this;
		local16.anInt2810 = arg0;
		if (local43 != null) {
			local16.method2332(new Class3_Sub26(local43));
		}
		local16.method2336();
		@Pc(74) Class342 local74 = this.aClass342_102;
		synchronized (this.aClass342_102) {
			this.aClass342_102.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
	public void method4162() {
		@Pc(12) Class342 local12 = this.aClass342_102;
		synchronized (this.aClass342_102) {
			this.aClass342_102.method7687();
		}
	}
}
