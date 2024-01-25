import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class375 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!af;")
	private final Class10 aClass10_61 = new Class10(64);

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public int anInt10361 = 0;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!ae;")
	private final Class8 aClass8_142;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public final int anInt10360;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class375(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_142 = arg2;
		this.anInt10360 = this.aClass8_142.method280(4);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)Lclient!bja;")
	public Class38 method8746(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_61;
		@Pc(16) Class38 local16;
		synchronized (this.aClass10_61) {
			local16 = (Class38) this.aClass10_61.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class8 local35 = this.aClass8_142;
		@Pc(44) byte[] local44;
		synchronized (this.aClass8_142) {
			local44 = this.aClass8_142.method262(arg0, 4);
		}
		local16 = new Class38();
		local16.aClass375_1 = this;
		local16.anInt1018 = arg0;
		if (local44 != null) {
			local16.method961(new Class6_Sub23(local44));
		}
		local16.method960();
		@Pc(75) Class10 local75 = this.aClass10_61;
		synchronized (this.aClass10_61) {
			this.aClass10_61.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public void method8747() {
		@Pc(14) Class10 local14 = this.aClass10_61;
		synchronized (this.aClass10_61) {
			this.aClass10_61.method380();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
	public void method8750() {
		@Pc(12) Class10 local12 = this.aClass10_61;
		synchronized (this.aClass10_61) {
			this.aClass10_61.method375();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
	public void method8751() {
		@Pc(12) Class10 local12 = this.aClass10_61;
		synchronized (this.aClass10_61) {
			this.aClass10_61.method369(5);
		}
	}
}
