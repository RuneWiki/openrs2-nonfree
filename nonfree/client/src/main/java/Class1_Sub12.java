import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
	public int anInt7604;

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "Lclient!nk;")
	public Class1_Sub32 aClass1_Sub32_5;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "Lclient!kca;")
	public Class1_Sub12 aClass1_Sub12_8;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Z")
	public volatile boolean aBoolean503 = true;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lclient!kca;")
	public abstract Class1_Sub12 method6515();

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public abstract void method6516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "()Lclient!kca;")
	public abstract Class1_Sub12 method6517();

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "()I")
	public int method6518() {
		return 255;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
	public abstract void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "([III)V")
	protected final void method6520(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean503) {
			this.method6519(arg0, arg1, arg2);
		} else {
			this.method6516(arg2);
		}
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
	public abstract int method6521();
}
